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
import { MenComponent } from './men/men.component';
import { WomenComponent } from './women/women.component';
import { KidComponent } from './kid/kid.component';
import { CartComponent } from './cart/cart.component';
import { PaymentComponent } from './payment/payment.component';



const routes: Routes = [
  {path:'login',component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'',component:HomeComponent},
  {path:'contact',component:ContactUsComponent},
  {path:'buyer',component:BuyerComponent},
  {path:'pwd',component:PasswordComponent},
  {path:'fc',component:FashinComponent},
  {path:'ec',component:ElectronicsComponent},
  {path:'fur',component:FurnitureComponent},
  {path:'mw',component:MenComponent},
{path:'ww',component:WomenComponent},
{path:'kw',component:KidComponent},
{path:'cart',component:CartComponent},
{path:'payment',component:PaymentComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
