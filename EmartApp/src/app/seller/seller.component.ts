import { Component, OnInit } from '@angular/core';
import { SproductService } from '../service/sproduct.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Product1 } from '../model/product1';

@Component({
  selector: 'app-seller',
  templateUrl: './seller.component.html',
  styleUrls: ['./seller.component.css']
})
export class SellerComponent implements OnInit {
  id:Product1;
  msg:string;
  isNew:boolean;

  constructor(
    private productService:SproductService,
    private actRoute:ActivatedRoute,
    private router:Router
  ) { }

  ngOnInit() {
    let id=this.actRoute.snapshot.params.id;
    if(id){
      this.isNew=false;
      this.productService.getById(id).subscribe(
        (data)=>{
          this.id=data;

        }
      );
    } else{
      this.isNew=true;
      this.id={
        id:0,
        productId:1,
        productName:'',
        category:'',
        price:0,
        discount:'',
        stock:0,
        description:'',

       
      };
    }
  }
  save(){
    let ob:Observable<Product1>;

    if(this.isNew){
      ob=this.productService.add(this.id);
    }else{
      ob=this.productService.save(this.id);
    }
    ob.subscribe(
      (data)=>{
        this.router.navigateByUrl("product");
      },
      (errRespone)=>{
        this.msg=errRespone.error;
        
      }
    );
  }
   
}


