import { Injectable } from '@angular/core';
import { Contact } from '../model/contact';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ContactService {
 
  
  save(contact:Contact):Observable<Contact>{
    throw new Error("Method not implemented");
  }
  baseUrl:string;

  constructor(private httpClient: HttpClient) { 
    this.baseUrl="http://localhost:8888/contacts";
    
  }
  getAll():Observable<Contact[]>{
    return this.httpClient.get<Contact[]>(this.baseUrl);
     
   }
   add(contact:Contact): Observable<Contact>{
    return this.httpClient.post<Contact>(this.baseUrl,contact);
  }
  getById(contact:number):Observable<Contact>{
    return this.httpClient.get<Contact>(`${this.baseUrl}/${contact}`);
  }
 

}
