import { Injectable } from '@angular/core';
import { Product } from '../entities/product.entity';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public products: Product[];
  constructor() {
    this.products = [
      { id: 'p1', name: 'Breil by Fort Collins', price: 600, photo: 'assets/images/girl1.jpg '},
      { id: 'p2', name: 'Women Zipper Solid Cardigan', price: 200, photo: 'assets/images/girl2.jpg' },
      { id: 'p3', name: 'Solid Hooded Neck Casual Solid Hooded Neck Casual ', price: 300, photo: 'assets/images/girl6.jpg' },
      { id: 'p4', name: 'Fashion Solid Blend Boys & Girls Stole, Fancy Scarf', price: 200, photo: 'assets/images/towel.jpg' },
      { id: 'p5', name: 'Solid CAP VIRAT COTTON FREE SIZE STYLISH Cap', price: 300, photo: 'assets/images/bag.jpg' },
      { id: 'p6', name: 'Women Zipper Solid Cardigan', price: 500, photo: 'assets/images/bag.jpg' },
      { id: 'p7', name: 'Large Camouflage Travel Backpack ', price: 2000, photo: 'assets/images/m3.jpg' },
      { id: 'p8', name: 'Full Sleeve Solid Men Jacket', price: 1000, photo: 'assets/img/blog/kids5.jpg' },
      { id: 'p9', name: 'Rapid Runner IDP Running Shoes For Men ', price: 1500, photo: 'assets/images/cap.jpg' }

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


   
  

  

  





