package com.jspider.product.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Products {

	@Value(value = "${companyName}")
	private String companyName;
	@Value(value = "${productName}")
	private String productName;
	@Value(value = "${productPrice}")
	private int productPrice;
	@Value(value = "${productType}")
	private String productType;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Products [companyName=" + companyName + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productType=" + productType + "]";
	}
	
	
}
