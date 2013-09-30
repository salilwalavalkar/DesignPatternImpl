package com.dptest.behavioralpattern.command;

/**
 * Concrete Command.
 */
public class ActionOpen implements IActionListenerCommand {

	private Document adoc;

	public ActionOpen(Document doc) {
		this.adoc = doc;
	}

	@Override
	public void execute() {
		adoc.open();
	}

}
