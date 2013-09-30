package com.dptest.creationalpattern.abstractfactory;

import com.dptest.creationalpattern.abstractfactory.animals.Animal;
import com.dptest.creationalpattern.abstractfactory.animals.Cat;
import com.dptest.creationalpattern.abstractfactory.animals.Dog;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}

}
