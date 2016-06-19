package com.wspublisher;

import javax.xml.ws.Endpoint;

import com.webservicex.ProductCatalog;

//publishing the webservice to a custom url
//you don't need to publish in glassfish.
// Cannot be used in production. For Development purposes only..
public class MyWebservicePublisher {
	public static void main(String args[]) {
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
	}
}
