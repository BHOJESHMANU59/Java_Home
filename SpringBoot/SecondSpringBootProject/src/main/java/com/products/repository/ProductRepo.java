package com.products.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {

	public String display(int id, String name, double price) {
		return "Product Added Successfully!!!!!!!!!!!!!";
	}

}
