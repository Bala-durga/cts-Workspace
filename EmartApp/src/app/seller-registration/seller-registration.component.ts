import { Component, OnInit } from '@angular/core';
import { Seller } from '../model/seller';
import { Signup } from '../model/signup';
import { SellerService } from '../service/seller.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-seller-registration',
  templateUrl: './seller-registration.component.html',
  styleUrls: ['./seller-registration.component.css']
})
export class SellerRegistrationComponent implements OnInit {
  signup=new Signup("","","","",9966855362);
  id:Seller;
  msg:string;
  isNew:boolean;

  constructor(
    private sellerService:SellerService,
    private actRoute:ActivatedRoute,
    private router:Router
  ) {

   }

  ngOnInit() {
    let id=this.actRoute.snapshot.params.id;
    if(id){
      this.isNew=false;
      this.sellerService.getById(id).subscribe(
        (data)=>{
          this.id=data;

        }
      );
    } else{
      this.isNew=true;
      this.id={
        id:0,
        firstName:'',
        lastName:'',
        email:'',
        password:'',
        phNumber:'',
      };
    }
  }
  save(){
    let ob:Observable<Seller>;

    if(this.isNew){
      ob=this.sellerService.add(this.id);
    }else{
      ob=this.sellerService.save(this.id);
    }
    ob.subscribe(
      (data)=>{
        this.router.navigateByUrl("/slogin");
      },
      (errRespone)=>{
        this.msg=errRespone.error;
        
      }
    );
  }

}

