package com.dptest.structuralpattern.composite;

/**
 * In the composite pattern, a tree structure exists where identical operations
 * can be performed on leaves and nodes.
 * 
 * The Gang of Four description of the composite pattern defines a client's
 * interaction with the tree struture via a Component interface, where this
 * interface includes the common operations on the composite and leaf classes,
 * and the add/remove/get operations on the composites of the tree.
 * 
 * 
 * 
 * Use the Composite pattern when
 * 
 * 1. you want to represent part-whole hierarchies of objects. 
 * 2. you want clients to be able to ignore the difference between compositions of objects and
 *    individual objects. Clients will treat all objects in the composite structure
 *    uniformly.
 * 
 * A common usage is the one used as a motivating example in the book, a display
 * system of graphic windows which can contain other windows and graphic
 * elements such as images, text. The composite can be composed at run-time, and
 * the client code can manipulate all the elements without concern for which
 * type it is for common operations such as drawing.
 * 
 */
public class WindowMain {

	public static void main(String[] args) {
		Window childWindow1 = new Window("childWindow1");
		Window childWindow2 = new Window("childWindow2");

		CompositeWindow mainWindow = new CompositeWindow();
		mainWindow.add(childWindow1);
		mainWindow.add(childWindow2);

		System.out.println("***Calling 'fill' on mainWindow***");
		mainWindow.fill();
		System.out.println("***Calling 'removeFill' on mainWindow***");
		mainWindow.removeFill();

	}

}
