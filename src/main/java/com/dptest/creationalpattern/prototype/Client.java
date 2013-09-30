package com.dptest.creationalpattern.prototype;

/**
 * Prototype pattern allows making new instances by copying the existing
 * instances.
 * 
 * Benefits:
 *   1. Hides complexities of creating of objects.
 *   2. The clients can get new objects without knowing whose type it will be.
 *   3. Reduce subclassing.
 * Drawback:
 *   1. Drawback to using the Prototype is that making a copy of an object can sometimes be complicated.
 *   2. Classes that have circular references to other classes cannot really be cloned.
 * 
 */
public class Client {

	public static void main(String[] args) {
		UserProfileRegistry.loadCache();
		// Client needs a new UserProfile object through getProfile() method
		Identity clonedIdentity = (Identity) UserProfileRegistry.getProfile("Charles Keating");
		System.out.println("UserProfile as cloned Identity");
		System.out.println("Name:" + clonedIdentity.getName());
		System.out.println("Date of Birth:" + clonedIdentity.getDob());
		BankDetails clonedBankDetails = (BankDetails) UserProfileRegistry.getProfile("Idiotechie");
		System.out.println("UserProfile as cloned BankDetail");
		System.out.println("Name:" + clonedBankDetails.getName());
		System.out.println("Bank Account Details:" + clonedBankDetails.getBankAccount());
	}

}
