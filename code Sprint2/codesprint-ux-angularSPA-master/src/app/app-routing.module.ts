import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppointmentFormComponent } from './appointment-form/appointment-form.component';
import { ContactUsComponent } from './contact-us/contact-us.component';


const routes: Routes = [
  {path:'',component:AppointmentFormComponent},
  {path:'',component:ContactUsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
