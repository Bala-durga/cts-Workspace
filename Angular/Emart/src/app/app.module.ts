import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';

import { LoginComponent } from './login/login.component';
import { from } from 'rxjs';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';

import { ContactUsComponent } from './contact-us/contact-us.component';
import { BuyerComponent } from './buyer/buyer.component';
import { PasswordComponent } from './password/password.component';
import { FashinComponent } from './fashin/fashin.component';
import { ElectronicsComponent } from './electronics/electronics.component';
import { FurnitureComponent } from './furniture/furniture.component';
import { MenComponent } from './men/men.component';
import { WomenComponent } from './women/women.component';
import { KidComponent } from './kid/kid.component';
import { CartComponent } from './cart/cart.component';
import { PaymentComponent } from './payment/payment.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    
    ContactUsComponent,
    BuyerComponent,
    PasswordComponent,
    FashinComponent,
    ElectronicsComponent,
    FurnitureComponent,
    MenComponent,
    WomenComponent,
    KidComponent,
    CartComponent,
    PaymentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
