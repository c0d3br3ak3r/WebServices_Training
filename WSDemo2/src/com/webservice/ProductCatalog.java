package com.webservice;

import java.util.List;

import javax.jws.WebService;

import com.webservice.impl.ProductCatalogImpl;

//Webservice exposed to the user

@WebService
public class ProductCatalog {
	
	ProductCatalogImpl service = new ProductCatalogImpl();
	
	public List<String> getCategories() {
		return service.getCategories();
	}
	
	public boolean addProductCategory(String category) {
		service.addCategory(category);
		return true;
	}
}
