package com.dptest.structuralpattern.adapter;

import java.util.ArrayList;

/**
 * Adapter(PrintableListAdapter) implements the target interface(PrintableList).
 */
public class PrintableListAdapter implements IPrintableList {

	@Override
	public void printList(ArrayList<String> list) {
		// Converting ArrayList<String> to String so that we can pass String to
		// adaptee class
		String listString = "";

		for (String s : list) {
			listString += s + "\t";
		}

		// instantiating adaptee class
		PrintString printString = new PrintString();
		printString.print(listString);
	}

}
