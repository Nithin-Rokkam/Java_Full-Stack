package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public List products=Arrays.asList(new ProductsBean(1,"Fridge",30000),
			new ProductsBean(2,"Television",23000),
			new ProductsBean(3,"Laptop",60000));
	
	public List<ProductsBean> getAllProducts() {
		return products;
	}
}
