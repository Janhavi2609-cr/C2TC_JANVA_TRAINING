package com.capgemini.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
}
public class StreamAPI5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> ProductList = new ArrayList<Product>();
		
		//adding products
		ProductList.add(new Product(1, "HP Laptop", 25000f));
		ProductList.add(new Product(2, "DEll Laptop", 3000f));
		ProductList.add(new Product(3, "Lenovo Laptop", 45000f));
		ProductList.add(new Product(4, "Apple Laptop", 80000f));
		ProductList.add(new Product(5, "Asus Laptop", 50000f));
		ProductList.add(new Product(6, "Boat Headphone", 2000f));
		
		List<Float> finalist = ProductList.stream().filter(p->p.price > 30000)	//filtering the data
							.map(p->p.price)   			//fetching the price
							.collect(Collectors.toList());
		System.out.println(finalist);
		
		//without map method, the data will not get fetched.
		//List<Product> finalist2 = ProductList.stream().filter(p->p.price > 30000).collect(Collectors.toList());
		
		//Compact approach
		ProductList.stream().filter(product->product.price == 30000).forEach(Product->System.out.println(Product.name));
		
		//count method
		/*ProductList.stream().filter(product->product.price < 25000).count();
		Long countProduct=ProductList.stream().filter(product->product.price>=25000).count();
		System.out.println(countProduct);
		}*/

		
	}

}
