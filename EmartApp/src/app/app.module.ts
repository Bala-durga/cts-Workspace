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

import { WomenComponent } from './women/women.component';

import { CartComponent } from './cart/cart.component';
import { PaymentComponent } from './payment/payment.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms'; 
import { SellerLoginComponent } from './seller-login/seller-login.component';
import { SellerRegistrationComponent } from './seller-registration/seller-registration.component';
import { SubCategoryComponent } from './sub-category/sub-category.component';

import { PayableComponent } from './payable/payable.component';
import { SellerComponent } from './seller/seller.component';
import { DisplayProductsComponent } from './display-products-component/display-products-component.component';



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
    WomenComponent,
    
    CartComponent,
    PaymentComponent,

    
    SellerLoginComponent,
    SellerRegistrationComponent,
    SubCategoryComponent,
   
    PayableComponent,
   
    SellerComponent,
   DisplayProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
