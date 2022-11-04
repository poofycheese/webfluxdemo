package org.poofycheese.webfluxdemo.model;

public class Pet {

	private String name;
	private String type;
	private String ownesName;
	
	
	public Pet(String name, String type, String ownesName) {
		super();
		this.name = name;
		this.type = type;
		this.ownesName = ownesName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnesName() {
		return ownesName;
	}
	public void setOwnesName(String ownesName) {
		this.ownesName = ownesName;
	}
	
	
}
