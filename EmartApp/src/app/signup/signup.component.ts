import { Component, OnInit } from '@angular/core';
import { Signup } from '../model/signup';
import { User } from '../model/user';
import { UserService } from '../service/user.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  signup=new Signup("","","","",9966855362);
  id:User;
  msg:string;
  isNew:boolean;

  constructor(
    private userService:UserService,
    private actRoute:ActivatedRoute,
    private router:Router
  ) { }

  ngOnInit() {

    let id=this.actRoute.snapshot.params.id;
    if(id){
      this.isNew=false;
      this.userService.getById(id).subscribe(
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
    let ob:Observable<User>;

    if(this.isNew){
      ob=this.userService.add(this.id);
    }else{
      ob=this.userService.save(this.id);
    }
    ob.subscribe(
      (data)=>{
        this.router.navigateByUrl("");
      },
      (errRespone)=>{
        this.msg=errRespone.error;
        
      }
    );
  }

}
