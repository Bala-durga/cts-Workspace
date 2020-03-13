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
import { SellerComponent } from './seller/seller.component';
import { HttpClientModule } from '@angular/common/http';
import { BuyerSignupComponent } from './buyer-signup/buyer-signup.component';
import { SellerLoginComponent } from './seller-login/seller-login.component';
import { SellerRegistrationComponent } from './seller-registration/seller-registration.component';
import { ThankyouComponent } from './thankyou/thankyou.component';
import { SubCategoryComponent } from './sub-category/sub-category.component';


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
    PaymentComponent,
    SellerComponent,
    BuyerSignupComponent,
    SellerLoginComponent,
    SellerRegistrationComponent,
    ThankyouComponent,
    SubCategoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
