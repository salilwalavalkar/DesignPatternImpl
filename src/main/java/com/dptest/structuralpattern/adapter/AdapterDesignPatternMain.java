package com.dptest.structuralpattern.adapter;

import java.util.ArrayList;

/**
 * In the adapter pattern, a wrapper class (ie, the adapter) is used translate
 * requests from it to another class (ie, the adaptee). In effect, an adapter
 * provides particular interactions with an adaptee that are not offered
 * directly by the adaptee.
 * 
 * As described by Gof: "Convert the interface of class into another interface
 * clients expect.Adapter lets class work together that couldn't otherwise
 * because of incompatible interfaces".
 */
public class AdapterDesignPatternMain {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		IPrintableList pl = new PrintableListAdapter();
		pl.printList(list);

	}
}
