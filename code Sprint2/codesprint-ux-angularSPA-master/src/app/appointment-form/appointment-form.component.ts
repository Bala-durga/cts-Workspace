import { Component, OnInit } from '@angular/core';
import { Appointment } from '../model/appointment';

@Component({
  selector: 'app-appointment-form',
  templateUrl: './appointment-form.component.html',
  styleUrls: ['./appointment-form.component.css']
})
export class AppointmentFormComponent implements OnInit {
  appointment=new Appointment("","",20,"",9999999,"","",2300,"");

  constructor() { }

  ngOnInit() {
  }
  
}
