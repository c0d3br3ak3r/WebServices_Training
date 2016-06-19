package com.webservicex;

import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface="com.webservicex.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {
	ProductServiceImpl service = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.webservicex.ProductCatalogInterface#getProductList()
	 */
	@Override
	public List<Product> getProductList() {
		return service.getProductList();
	}
	
	/* (non-Javadoc)
	 * @see com.webservicex.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String, int)
	 */
	@Override
	public boolean addProduct(String name, String sku, int price) {
		return service.addProduct(name, sku, price);
	}
}
