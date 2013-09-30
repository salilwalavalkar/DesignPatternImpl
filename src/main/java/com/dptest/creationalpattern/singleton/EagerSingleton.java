package com.dptest.creationalpattern.singleton;

/**
 * This is a design pattern where an instance of a class is created much before
 * it is actually required. Mostly it is done on system start up. In singleton
 * pattern, it refers to create the singleton instance irrespective of whether
 * any other class actually asked for its instance or not.
 */
public class EagerSingleton {

	private static EagerSingleton INSTANCE = new EagerSingleton();

	private EagerSingleton() {
		//private constructor
	}

	public static EagerSingleton getInstance() {
		System.out.println("Cached instance");
		return INSTANCE;
	}

	public void getData() {
		System.out.println("EagerSingleton");
	}

}
