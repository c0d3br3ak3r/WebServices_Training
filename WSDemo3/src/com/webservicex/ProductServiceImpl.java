package com.webservicex;

import java.util.ArrayList;
import java.util.List;

//to add, get all the products list
public class ProductServiceImpl {
	List<Product> products;
	public ProductServiceImpl() {
		products = new ArrayList<Product>();
		Product product1 = new Product("Sherlock Holmes","111",1234);
		Product product2 = new Product("James Bond", "222",4567);
		Product product3 = new Product("Jason Bourne","333",8901);
		products.add(product1);
		products.add(product2);
		products.add(product3);
	}
	
	public List<Product> getProductList() {
		return products;
	}

	public boolean addProduct(String name, String sku, int price) {
		Product product = new Product(name,sku,price);
		products.add(product);
		return true;
	}
}
