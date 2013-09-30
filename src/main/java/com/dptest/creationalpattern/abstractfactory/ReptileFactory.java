package com.dptest.creationalpattern.abstractfactory;

import com.dptest.creationalpattern.abstractfactory.animals.Animal;
import com.dptest.creationalpattern.abstractfactory.animals.Snake;
import com.dptest.creationalpattern.abstractfactory.animals.Tyrannosaurus;

public class ReptileFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) {
		if ("snake".equals(type)) {
			return new Snake();
		} else {
			return new Tyrannosaurus();
		}
	}

}
