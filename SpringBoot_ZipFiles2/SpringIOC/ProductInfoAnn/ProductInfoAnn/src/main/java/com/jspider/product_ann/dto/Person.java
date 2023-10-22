package com.jspider.product_ann.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value(value = "${personId}")
	private int personId;
	@Value(value = "${name}")
	private String name;
	@Value(value = "${age}")
	private int age;
	@Value(value = "${address}")
	private String address;
	@Value(value = "${phone}")
	private long phone;
	@Value(value = "${emailId}")
	private String emailId;
	@Autowired
	private IdCard idCard; //IOC injects the Id card objects
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public IdCard getIdCard() {
		return idCard;
	}
	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", address=" + address + ", phone="
				+ phone + ", emailId=" + emailId + ", idCard=" + idCard + "]";
	}
	
	
}
