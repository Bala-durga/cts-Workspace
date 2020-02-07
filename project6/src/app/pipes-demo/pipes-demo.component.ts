import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes-demo',
  templateUrl: './pipes-demo.component.html',
  styleUrls: ['./pipes-demo.component.css']
})
export class PipesDemoComponent  {
  strData:string;
  numData:number;
  date:Date;
  constructor() {
    this.strData="welcome";
    this.numData=Math.PI;
    this.date=new Date;
    

  }
}
