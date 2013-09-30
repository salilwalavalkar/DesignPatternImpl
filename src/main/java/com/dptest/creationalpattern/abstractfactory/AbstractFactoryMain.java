package com.dptest.creationalpattern.abstractfactory;

import com.dptest.creationalpattern.abstractfactory.animals.Animal;

/**
 * An abstract factory is a factory that returns factories. Why is this layer of
 * abstraction useful? A normal factory can be used to create sets of related
 * objects. An abstract factory returns factories. Thus, an abstract factory is
 * used to return factories that can be used to create sets of related objects.
 * 
 * The pattern is best utilised when your system has to create multiple families
 * of products or you want to provide a library of products without exposing the
 * implementation details. As you'll have noticed, a key characteristic is that
 * the pattern will decouple the concrete classes from the client.
 */
public class AbstractFactoryMain {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();

		SpeciesFactory speciesFactory1 = abstractFactory
				.getSpeciesFactory("reptile");
		Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
		System.out.println("a1 sound: " + a1.makeSound());
		Animal a2 = speciesFactory1.getAnimal("snake");
		System.out.println("a2 sound: " + a2.makeSound());

		SpeciesFactory speciesFactory2 = abstractFactory
				.getSpeciesFactory("mammal");
		Animal a3 = speciesFactory2.getAnimal("dog");
		System.out.println("a3 sound: " + a3.makeSound());
		Animal a4 = speciesFactory2.getAnimal("cat");
		System.out.println("a4 sound: " + a4.makeSound());

	}

}
