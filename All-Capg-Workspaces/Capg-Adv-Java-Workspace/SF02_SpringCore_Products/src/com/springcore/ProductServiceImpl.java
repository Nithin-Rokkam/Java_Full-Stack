package com.springcore;

public class ProductServiceImpl implements ProductService {
	String product;
	public ProductServiceImpl() {
		
	}
	
	public ProductServiceImpl(String product) {
		this.product=product;
	}
	
	public void setProduct(String product) {
		this.product=product;
	}
	
	@Override
	public void allProducts() {
		System.out.println("Hello product "+product);
	}

}//IOC inversion of control where spring framework will create objects for us instead of us directly creation
//we used constructor injection and setter injection in this code.
//spring has the above two injections.
