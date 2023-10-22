package com.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.repository.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;

	public String display(int id, String name, double price)
	{
		return  repo.display(id, name, price);
	}
	

}
