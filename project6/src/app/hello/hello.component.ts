import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent {
  userName:String;


  constructor() {
    this.userName="bala";
  }
greet=()=>{
  alert(`hello ${this.userName} Good to see you`);
}
  
}
