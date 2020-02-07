import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private firstNum:number=null;
  private secondNum:number=null;
  private result:number=null;
  public add():void{
    
    
    this.result=this.firstNum+this.secondNum;
   
  }
    public sub():void{
      
    this.result=this.firstNum-this.secondNum;
    
    }
    public  mul():void{
    
    this.result=this.firstNum*this.secondNum;
    
    }
    public div():void{
     
    this.result=this.firstNum/this.secondNum;
  
    }
  
  }
