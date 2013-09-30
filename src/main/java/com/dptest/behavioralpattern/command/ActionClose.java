package com.dptest.behavioralpattern.command;

/**
 * Concrete Command.
 */
public class ActionClose implements IActionListenerCommand{
	
	private Document adoc;

	public ActionClose(Document doc) {
		this.adoc = doc;
	}

	@Override
	public void execute() {
		adoc.close();
	}

}
