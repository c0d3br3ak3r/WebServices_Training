package com.webservicex;
//Custom data type - JAX-B annotated

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Product")
@XmlType(propOrder={"sku","name","price"})
public class Product {
	String sku;
	String name;
	int price;
	
	public Product() {
		
	}
	
	Product(String name, String sku, int price) {
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	
	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
