package com.dptest.creationalpattern.abstractfactory;

import com.dptest.creationalpattern.abstractfactory.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type);

}
