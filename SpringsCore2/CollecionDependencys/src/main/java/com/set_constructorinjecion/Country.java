package com.set_constructorinjecion;

import java.util.Set;

public class Country 
{
	private String code;
	private String name;
	private Set<String> states;
	public Country(String code, String name, Set<String> states) {
		super();
		this.code = code;
		this.name = name;
		this.states = states;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", states=" + states + "]";
	}
	

}
