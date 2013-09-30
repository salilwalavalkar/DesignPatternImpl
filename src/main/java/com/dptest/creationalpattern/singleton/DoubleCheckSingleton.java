package com.dptest.creationalpattern.singleton;

/**
 * Suppose there are two threads T1 and T2. Both comes to create instance and
 * execute “instance==null”, now both threads have identified instance variable
 * to null thus assume they must create an instance. They sequentially goes to
 * synchronized block and create the instances. At the end, we have two
 * instances in our application.
 * 
 * This error can be solved using double-checked locking. This principle tells
 * us to recheck the instance variable again in synchronized block.
 * 
 * The "volatile" keyword ensures that multiple threads handle the INSTANCE
 * variable correctly when it is being initialized to the DoubleCheckSingleton
 * instance.
 */
public class DoubleCheckSingleton {
	private volatile static DoubleCheckSingleton INSTANCE;

	private DoubleCheckSingleton() {
		//private constructor
	}

	public static DoubleCheckSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (INSTANCE == null) {
					System.out.println("Creating new instance");
					INSTANCE = new DoubleCheckSingleton();
					return INSTANCE;
				}
			}
		}
		System.out.println("Cached instance");
		return INSTANCE;
	}

	public void getData() {
		System.out.println("DoubleCheckSingleton");
	}

}
