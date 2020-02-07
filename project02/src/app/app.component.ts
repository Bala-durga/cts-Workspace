import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private jobTitle:string=null;
  private salary:number=null;
  private annualSalary:number=null;
  private logo:string=null;
  public username:string=null;
  public constructor(){
    this.jobTitle="Programmer Analyst Trainee";
    this.salary=30000;
    this.logo="assets/bala.jpg";
  }
  public getAnnualSalary():number{
    this.annualSalary=this.salary*12;
    return this.annualSalary;
  }
  public greetUser():void{
    alert("welcome user");
    this.username="Mr"+this.username;
   alert(this.username);
  }

}

