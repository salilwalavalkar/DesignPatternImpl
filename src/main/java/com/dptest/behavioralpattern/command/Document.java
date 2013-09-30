package com.dptest.behavioralpattern.command;

/**
 * Receiver class.
 */
public class Document {
	public void open() {
		System.out.println("Document Opened");
	}

	public void close() {
		System.out.println("Document Closed");
	}
}
