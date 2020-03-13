import { Injectable } from '@angular/core';
import { Seller } from '../model/seller';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SellerService {
  save(id: Seller): Observable<Seller> {
    throw new Error("Method not implemented.");
  }
  baseUrl:string;
  constructor(private httpClient: HttpClient) { 
    this.baseUrl="http://localhost:4455/registrations";
  }
  getAll():Observable<Seller[]>{
    return this.httpClient.get<Seller[]>(this.baseUrl);
     
   }
   getById(id:number) :Observable<Seller>{
    return this.httpClient.get<Seller>(`${this.baseUrl}/${id}`);
 
   }
   add(signup:Seller): Observable<Seller>{
    return this.httpClient.post<Seller>(this.baseUrl,signup);
  }


}
