package com.dptest.creationalpattern.singleton;

public enum EnumSingleton {
	INSTANCE;
	
	public void getData(){
		System.out.println("EnumSingleton");
	}
}
