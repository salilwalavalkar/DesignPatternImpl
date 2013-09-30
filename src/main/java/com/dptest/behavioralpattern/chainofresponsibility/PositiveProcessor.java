package com.dptest.behavioralpattern.chainofresponsibility;

public class PositiveProcessor implements IChain{
	
	private IChain nextInChain;

	public void setNext(IChain c) {
		nextInChain = c;
	}

	public void process(int number) {
		if (number > 0) {
			System.out.println("PositiveProcessor : " + number);
		} else {
			nextInChain.process(number);
		}
	}
}
