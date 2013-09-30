package com.dptest.behavioralpattern.observer;

/**
 * In the observer pattern, an object called the subject maintains a collection
 * of objects called observers. When the subject changes, it notifies the
 * observers. Observers can be added or removed from the collection of observers
 * in the subject. The changes in state of the subject can be passed to the
 * observers so that the observers can change their own state to reflect this
 * change.
 * 
 * The observer pattern defines a one-to-many dependency between objects so that
 * when one object changes state, all of its dependents are notified and updated
 * automatically. The object which is being watched is called the subject.The
 * objects which are watching the state changes are called observers or
 * listeners.
 * 
 * Java Message Service (JMS) uses Observer pattern along with Mediator pattern
 * to allow applications to subscribe and publish data to other applications.
 * 
 * Model-View-Controller (MVC) frameworks also use Observer pattern where Model
 * is the Subject and Views are observers that can register to get notified of
 * any change to the model.
 */
public class ObserverPatternMain {

	public static void main(String[] args) {

		WeatherStation weatherStation = new WeatherStation(33);

		WeatherCustomer1 wc1 = new WeatherCustomer1();
		WeatherCustomer2 wc2 = new WeatherCustomer2();
		weatherStation.addObserver(wc1);
		weatherStation.addObserver(wc2);

		weatherStation.setTemperature(34);

		weatherStation.removeObserver(wc1);

		weatherStation.setTemperature(35);
	}

}
