package com.webservicex;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

// Note - this is the end point interface.

@WebService(name="ProductCatalogWebService",portName="ProductCatalogServicePort",
			targetNamespace="http://www.jarvis.webservices.com")
public interface ProductCatalogInterface {

	@WebMethod(operationName="listProducts")
	@WebResult(name="ProductDetails")
	public List<Product> getProductList();
	
	@WebMethod(operationName="addProduct")
	public boolean addProduct(String name, String sku, int price);

}