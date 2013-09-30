package com.dptest.creationalpattern.factory;

/**
 * A factory is a Java class that is used to encapsulate object creation code. A
 * factory class instantiates and returns a particular type of object based on
 * data passed to the factory. The different types of objects that are returned
 * from a factory typically are subclasses of a common parent class.
 * 
 * The data passed from the calling code to the factory can be passed either
 * when the factory is created or when the method on the factory is called to
 * create an object.
 */
public class FactoryPatternMain {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();

		Animal a1 = animalFactory.getAnimal("feline");
		System.out.println("a1 sound: " + a1.makeSound());

		Animal a2 = animalFactory.getAnimal("canine");
		System.out.println("a2 sound: " + a2.makeSound());
	}
}
