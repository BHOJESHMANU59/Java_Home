package com.set_setterinjection;

import java.util.Set;

public class Mobile {
	private int id;
	private String name;
	private Set<String> sims;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getSims() {
		return sims;
	}
	public void setSims(Set<String> sims) {
		this.sims = sims;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", sims=" + sims + "]";
	}
	

}
