package com.dptest.creationalpattern.prototype;

public class UserProfile implements Cloneable{
	
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * This method creates and return the copy of the super class.
	 */
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;

	}

}
