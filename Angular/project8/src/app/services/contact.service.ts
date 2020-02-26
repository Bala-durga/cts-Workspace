import { Injectable } from '@angular/core';
import{Contact} from '../models/contact';

@Injectable({
  providedIn: 'root'
})
export class ContactService {
  contacts:Contact[];

  constructor() { 
    this.contacts=[
      {contactID:101,firstName:"lalathi",lastName:"mummireddygari",dob:new Date("1998-05-28"),mobileNumber:"1234567890",alternateMobileNumber:"2345678769",mailId:"lal@gmail.com",organization:"cts"},
      {contactID:102,firstName:"lal",lastName:"mummi",dob:new Date("1995-04-24"),mobileNumber:"1234567345",alternateMobileNumber:"9875678769",mailId:"lala@gmail.com",organization:"cts"},
      {contactID:103,firstName:"lalu",lastName:"mummireddy",dob:new Date("1996-05-27"),mobileNumber:"9191567890",alternateMobileNumber:"8975678769",mailId:"lalu@gmail.com",organization:"cts"},
      {contactID:104,firstName:"lalli",lastName:"reddy",dob:new Date("1997-06-23"),mobileNumber:"1239876890",alternateMobileNumber:"4565678769",mailId:"lalathi@gmail.com",organization:"cts"},
      {contactID:105,firstName:"bala",lastName:"durga",dob:new Date("1999-07-20"),mobileNumber:"9999567890",alternateMobileNumber:"6755678769",mailId:"lalli@gmail.com",organization:"cts"}

    ];
  }
  getAll():Contact[]{
    return this.contacts;

  }
  get(id:number){
    return this.contacts.find((c)=>(c.contactID==id));
  }
  add(contact:Contact){
    this.contacts.push(contact);
  }
  update(contact:Contact){
    let index=this.contacts.findIndex((c)=>(c.contactID===contact.contactID));
    if(index>-1){
      this.contacts[index]=contact;
    }
  }
  delete(id:number){
    let index=this.contacts.findIndex((contact)=>(contact.contactID===id));
    if(index>-1){
      this.contacts.splice(index,1);
    }
  }
}
