import { Component, OnInit } from '@angular/core';
import { Product } from '../models/Product.model';
@Component({
  selector: 'app-product-show',
  templateUrl: './product-show.component.html',
  styleUrls: ['./product-show.component.css']
})
export class ProductShowComponent implements OnInit {

  products: Array<Product>;

  constructor() {

    this.products = [
        new Product("First","firstdesc",100),
        new Product("Second","seconddesc",200)
    ];

   }

  ngOnInit() {
  }

  save(name:HTMLInputElement ,desc:HTMLInputElement,cost:HTMLInputElement){

  let product = new Product(name.value , desc.value , parseInt(cost.value))
  
    this.products.push(product);

  }
}
