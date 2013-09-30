package com.dptest.behavioralpattern.chainofresponsibility;

public interface IChain {
	
	void setNext(IChain nextInChain);
	
	void process(int number);

}
