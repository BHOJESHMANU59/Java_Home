package com.jspider.product_ann.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IdCard {
	@Value(value = "${panCardNumber}")
	private String panCardNumber;
	@Value(value = "${adharCardNumber}")
	private long adharCardNumber;
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public long getAdharCardNumber() {
		return adharCardNumber;
	}
	public void setAdharCardNumber(long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}
	@Override
	public String toString() {
		return "IdCard [panCardNumber=" + panCardNumber + ", adharCardNumber=" + adharCardNumber + "]";
	}
	

}
