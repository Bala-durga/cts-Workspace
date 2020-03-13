import { Component, OnInit } from '@angular/core';
import { BuyerSignup } from '../model/buyer-signup';

@Component({
  selector: 'app-buyer-signup',
  templateUrl: './buyer-signup.component.html',
  styleUrls: ['./buyer-signup.component.css']
})
export class BuyerSignupComponent implements OnInit {
  buyer:BuyerSignup;

  constructor() { }

  ngOnInit() {
  }

}
