import { Component, OnInit } from '@angular/core';
import { Payment } from '../model/payment';
import { PaymentService } from '../service/payment.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Pay } from '../model/pay';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  pmt=new Pay("","","","","","","","","","",0);
  pay:Payment;
  msg:string;
  isNew:boolean;

  constructor(
    private paymentService:PaymentService,
    private actRoute:ActivatedRoute,
    private router:Router
  ) { }

  ngOnInit() {

    let pay=this.actRoute.snapshot.params.id;
    if(pay){
      this.isNew=false;
      this.paymentService.getById(pay).subscribe(
        (data)=>{
          this.pay=data;

        }
      );
    } else{
      this.isNew=true;
      this.pay={
        cardCode:0,
         country:'',
        firstName:'',
        lastName:'',
        address:'',
        city:'',
        state:'',
        zipcode:'',
        cardType:'',
        cardNumber:'',
        phoneNumber:9966855362,
         date:new Date()
     
      };
    }
  }
  save(){
    let ob:Observable<Payment>;

    if(this.isNew){
      ob=this.paymentService.add(this.pay);
    }else{
      ob=this.paymentService.save(this.pay);
    }
    ob.subscribe(
      (data)=>{
        this.router.navigateByUrl("/payable");
      },
      (errRespone)=>{
        this.msg=errRespone.error;
        
      }
    );
  }

}

