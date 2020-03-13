import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Product1 } from '../model/product1';

@Injectable({
  providedIn: 'root'
})
export class SproductService {
  save(id: Product1): Observable<Product1> {
    throw new Error("Method not implemented.");
  }
 baseUrl:string;

  

  constructor(private httpClient: HttpClient) {
    this.baseUrl="http://localhost:7777/products";
   }
   getAll():Observable<Product1[]>{
    return this.httpClient.get<Product1[]>(this.baseUrl);
     
   }
   getById(id:number) :Observable<Product1>{
    return this.httpClient.get<Product1>(`${this.baseUrl}/${id}`);
 
   }
   add(id:Product1): Observable<Product1>{
    return this.httpClient.post<Product1>(this.baseUrl,id);
  }

}

