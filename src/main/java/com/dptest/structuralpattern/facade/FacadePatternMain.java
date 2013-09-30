package com.dptest.structuralpattern.facade;

/**
 * In the facade pattern, a facade classes is used to provide a single interface
 * to set of classes. The facade simplifies a clients interaction with a complex
 * system by localizing the interactions into a single interface.
 * 
 * We have two classes(Addition, Division). Facade class combine these two
 * classes and perform average function.
 */
public class FacadePatternMain {

	public static void main(String[] args) {

		Facade facade = new Facade();

		int x = 5;
		int y = 8;
		System.out.println("Average of " + x + " & " + y + ": "
				+ facade.average(x, y));
	}
}
