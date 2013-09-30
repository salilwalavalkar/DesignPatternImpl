package com.dptest.behavioralpattern.templatemethod;

/**
 * In the template method pattern, a method (the 'template method') defines the
 * steps of an algorithm. The implementation of these steps (ie, methods) can be
 * deferred to subclasses. Thus, a particular algorithm is defined in the
 * template method, but the exact steps of this algorithm can be defined in
 * subclasses. The template method is implemented in an abstract class.The steps
 * (methods) of the algorithm are declared in the abstract class, and the
 * methods whose implementations are to be delegated to subclasses are declared
 * abstract.
 * 
 * Important points about template method pattern:
 * 1. Template method in super class follows “the Hollywood principle”: “Don’t call us, we’ll call you”. 
 *    This refers to the fact that instead of calling the methods from base class in the subclasses, 
 *    the methods from subclass are called in the template method from superclass.
 * 2. Template method in super class should not be overriden so make it final.
 * 3. Customization hooks:Methods containing a default implementation that may be overidden in other 
 * 	  classes are called hooks methods. Hook methods are intended to be overridden, concrete methods are not.
 *    So in this pattern,we can provide hooks methods.
 * 4. Template methods are technique for code reuse because with this,
 *    you can figure out common behavior and defer specific behavior to subclasses.
 */
public class TemplateMethodMain {

	public static void main(String[] args) {

		DataParser dataParser1 = new ExcelDataParser();
		dataParser1.parseDataAndGenerateOutput();

		System.out.println();

		DataParser dataParser2 = new DatabaseDataParser();
		dataParser2.parseDataAndGenerateOutput();
	}

}
