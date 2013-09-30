package com.dptest.creationalpattern.singleton;

/**
 * Lazy initialization is the tactic of delaying the creation of an object, the
 * calculation of a value, or some other expensive process until the first time
 * it is needed. In singleton pattern, it restricts the creation of instance
 * until requested first time.
 */
public class LazySingleton {
	private static LazySingleton INSTANCE;

	private LazySingleton() {
		//private constructor
	}

	public static LazySingleton getInstance() {
		if (INSTANCE == null) {
			System.out.println("Creating new instance");
			INSTANCE = new LazySingleton();
			return INSTANCE;
		}
		System.out.println("Cached instance");
		return INSTANCE;
	}

	public void getData() {
		System.out.println("LazySingleton");
	}

}
