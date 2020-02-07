import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent  {
  webTitle:string;
  welcomeImage:string;
  welcomeText:string;

  constructor() {
    this.webTitle="Angular SPA Demo APP";
    this.welcomeText="Hey everyone welcome to angular";
    this.welcomeImage="src\assets\images\eb702b4b213b9d22bc534e8e7ef6f446.jpg";
   }

 

}
