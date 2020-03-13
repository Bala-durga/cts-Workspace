import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
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

import { SellerLoginComponent } from './seller-login/seller-login.component';
import { SellerRegistrationComponent } from './seller-registration/seller-registration.component';
import { SubCategoryComponent } from './sub-category/sub-category.component';

import { PayableComponent } from './payable/payable.component';
import { SellerComponent } from './seller/seller.component';
import { DisplayProductsComponent } from './display-products-component/display-products-component.component';


const routes: Routes = [
  {path:'login',component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'',component:HomeComponent},
  {path:'contact',component:ContactUsComponent},
  {path:'login/buyer',component:BuyerComponent},
  {path:'buyer',component:BuyerComponent},
  {path:'pwd',component:PasswordComponent},
  {path:'fc',component:FashinComponent},
  {path:'ec',component:ElectronicsComponent},
  {path:'fur',component:FurnitureComponent},
  {path:'ww',component:WomenComponent},
 {path:'product',component:DisplayProductsComponent},
{path:'cart',component:CartComponent},
{path:'payment',component:PaymentComponent},
{path:'seller',component:SellerComponent},
{path:'slogin',component:SellerLoginComponent},
{path:'slogin/seller',component:SellerComponent},
{path:'sreg',component:SellerRegistrationComponent},

{path:'payable',component:PayableComponent },
{path:'subcategory',component:SubCategoryComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
