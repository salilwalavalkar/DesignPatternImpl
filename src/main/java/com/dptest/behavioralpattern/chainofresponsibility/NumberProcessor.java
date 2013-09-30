package com.dptest.behavioralpattern.chainofresponsibility;

/**
 * In the chain of responsibility pattern, a series of handler objects are
 * chained together to handle a request made by a client object. If the first
 * handler can't handle the request, the request is forwarded to the next
 * handler, and it is passed down the chain until the request reaches a handler
 * that can handle the request or the chain ends.
 * 
 * Exception handling in Java is based on Chain of responsibility pattern.
 * 
 * 1. Sender will not know which object in the chain will serve its request 
 * 2. Each node in the chain may decide to serve the request --> catching an
 * 	  exception and wrapping it with an Application specific exception 
 * 3. Each node can forward the request --> throwing exception to the immediate caller 
 * 4. None of the node can serve the request --> Leaves the job with the caller
 */
public class NumberProcessor {

	public static void main(String[] args) {
		// configure Chain of Responsibility
		IChain c1 = new NegativeProcessor();
		IChain c2 = new ZeroProcessor();
		IChain c3 = new PositiveProcessor();
		//setting successors
		c1.setNext(c2);
		c2.setNext(c3);

		// calling chain of responsibility
		c1.process(99);
		c1.process(-30);
		c1.process(0);
	}

}
