package com.dptest.structuralpattern.composite;

public class Window implements IWindow{
	
	String name;
	
	public Window(String name){
		this.name = name;
	}

	@Override
	public void fill() {
		System.out.println(name + " window filled");
	}

	@Override
	public void removeFill() {
		System.out.println(name + " window fill removed");
	}

}
