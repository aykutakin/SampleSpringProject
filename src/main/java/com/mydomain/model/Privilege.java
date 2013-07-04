package com.mydomain.model;

/**
 * 
 * User Privileges
 * 
 * @author aakin
 * 
 */
public class Privilege {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Privilege [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
