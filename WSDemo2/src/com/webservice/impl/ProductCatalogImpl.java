package com.webservice.impl;

import java.util.ArrayList;
import java.util.List;

//Implementation is hidden from user - not a webservice.
public class ProductCatalogImpl {
	private List<String> categories;
	
	public ProductCatalogImpl() {
		categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
	}
	
	public List<String> getCategories() {
		return categories;
	}
	
	public void addCategory(String category) {
		categories.add(category);
	}
}
