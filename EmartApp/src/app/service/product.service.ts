import { Injectable } from '@angular/core';
import { Product } from '../entities/product.entity';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public products: Product[];
  constructor() {
    this.products = [
      { id: 'p1', name: 'Breil printed frok', price: 600, photo: 'assets/images/w2.jpg '},
      { id: 'p2', name: 'Kids  printed Wool frok with sleeves', price: 500, photo: 'assets/images/k3.jpg' },
      { id: 'p3', name: 'Burberry leather Watch  ', price: 1600, photo: 'assets/images/watch.jpg' },
      { id: 'p4', name: 'Roadster Blue Skinny Fit Mind-Rise Low cropped Jeans', price: 2000, photo: 'assets/images/m2.jpg' },
      { id: 'p5', name: 'Women Solid Leggings of 5 pairs', price: 2000, photo: 'assets/wbottom.jpg' },
      { id: 'p6', name: 'Gents Solid Mustard Sneakers', price: 4000, photo: 'assets/images/mens3.jpg' },
      { id: 'p7', name: 'Men Blue Solid Slim-Fit Single-Breasted Blazer ', price: 2500, photo: 'assets/images/blazer.jpg' },
      { id: 'p8', name: 'Full Sleeve Solid Kid Jacket', price: 1000, photo: 'assets/images/kid.jpg' },
      { id: 'p9', name: 'Women Solid Sweater', price: 1550, photo: 'assets/images/sweater.jpg' },
      { id: 'p10', name: 'Women Solid Sweater', price: 1550, photo: 'assets/mob.jpg' },
      { id: 'p11', name: 'Apple EarPhones', price: 1050, photo: 'assets/images/earphones.jpg' },
      { id: 'p12', name: 'Pendrive', price: 550, photo: 'assets/images/pendrive.jpg' },
      { id: 'p13', name: 'Apple Tab', price: 50000, photo: 'assets/images/tab.jpg' }

  ];
}


findAll(): Product[] {
  return this.products;
}

find(id: string): Product {
  return this.products[this.getSelectedIndex(id)];
}

public getSelectedIndex(id: string) {
  for (var i = 0; i < this.products.length; i++) {
      if (this.products[i].id == id) {
          return i;
      }
  }
  return -1;
}

}


   
  

  

  





