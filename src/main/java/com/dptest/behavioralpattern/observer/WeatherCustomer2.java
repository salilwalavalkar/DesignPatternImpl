package com.dptest.behavioralpattern.observer;

public class WeatherCustomer2 implements IWeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		System.out.println("Weather customer 2 just found out the temperature is:" + temperature);
	}

}
