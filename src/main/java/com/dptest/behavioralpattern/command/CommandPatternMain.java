package com.dptest.behavioralpattern.command;

/**
 * Command interface declares a method for executing a particular action.
 * Command design pattern is used to encapsulate a request as an object and pass
 * to an invoker, wherein the invoker does not knows how to service the request
 * but uses the encapsulated command to perform an action.
 * 
 * Chain of Responsibility pattern forwarded requests along a chain, the Command
 * pattern forwards the request to a specific module.
 * 
 * Following are the participants of the Command Design pattern:
 * 1. Command – This is an interface for executing an operation. (ActionListenerCommand.java)
 * 2. ConcreteCommand – This class extends the Command interface and implements the execute method. 
 *                      This class creates a binding between the action and the receiver.
 *                      (ActionOpen.java, ActionClose.java)
 * 3. Invoker – This class asks the command to carry out the request. (MenuOptions.java)
 * 4. Receiver – This class knows to perform the operation. (Document.java)
 * 5. Client – This class creates the ConcreteCommand class and associates it with the receiver.
 * 			   (CommandPatternMain.java)
 * 
 * Implementations of java.lang.Runnable and javax.swing.Action follows command
 * design pattern.
 */
public class CommandPatternMain {

	public static void main(String[] args) {
		Document doc = new Document();
		IActionListenerCommand clickOpen = new ActionOpen(doc);
		IActionListenerCommand clickClose = new ActionClose(doc);
		MenuOptions menu = new MenuOptions(clickOpen, clickClose);
		menu.clickOpen();
		menu.clickClose();
	}

}
