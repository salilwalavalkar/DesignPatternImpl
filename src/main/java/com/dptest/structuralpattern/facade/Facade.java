package com.dptest.structuralpattern.facade;

public class Facade {
	
	public double average(int x, int y){
		Addition add = new Addition();
		Division divide = new Division();
		return divide.divideBy2(add.addTwoNumber(x, y));
	}

}
