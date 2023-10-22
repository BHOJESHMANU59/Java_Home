package com.products.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Products {
	private int pId;
	private String pName;
	private double price;
	

}
