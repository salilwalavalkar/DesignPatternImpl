package com.dptest.creationalpattern.singleton;

/**
 * A singleton is a class that is instantiated only once. This is typically
 * accomplished by creating a static field in the class representing the class.
 * A static method exists on the class to obtain the instance of the class and
 * is typically named something such as getInstance().
 */
public class SingletonMain {

	public static void main(String[] args) {
		LazySingleton.getInstance().getData();
		LazySingleton.getInstance().getData();

		System.out.println("*******************************");

		EagerSingleton.getInstance().getData();
		EagerSingleton.getInstance().getData();

		System.out.println("*******************************");

		DoubleCheckSingleton.getInstance().getData();
		DoubleCheckSingleton.getInstance().getData();

		System.out.println("*******************************");

		EnumSingleton.INSTANCE.getData();
	}

}
