package org.poofycheese.webfluxdemo.model;

public class Pet {

	private String name;
	private String type;
	private String ownersName;
	
	
	public Pet(String name, String type, String ownersName) {
		super();
		this.name = name;
		this.type = type;
		this.ownersName = ownersName;
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
	public String getOwnersName() {
		return ownersName;
	}
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	
	
	
}
