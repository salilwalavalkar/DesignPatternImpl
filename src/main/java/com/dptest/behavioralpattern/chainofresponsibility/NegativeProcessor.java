package com.dptest.behavioralpattern.chainofresponsibility;

public class NegativeProcessor implements IChain {

	private IChain nextInChain;

	public void setNext(IChain c) {
		nextInChain = c;
	}

	public void process(int number) {
		if (number < 0) {
			System.out.println("NegativeProcessor : " + number);
		} else {
			nextInChain.process(number);
		}
	}
}
