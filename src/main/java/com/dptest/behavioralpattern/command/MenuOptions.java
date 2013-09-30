package com.dptest.behavioralpattern.command;

/**
 * Invoker class.
 */
public class MenuOptions {
	private IActionListenerCommand openCommand;
	private IActionListenerCommand closeCommand;

	public MenuOptions(IActionListenerCommand open, IActionListenerCommand close) {
		this.openCommand = open;
		this.closeCommand = close;
	}

	public void clickOpen() {
		openCommand.execute();
	}

	public void clickClose() {
		closeCommand.execute();
	}

}
