package com.dptest.behavioralpattern.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WeatherStation implements IWeatherSubject{
	
	Set<IWeatherObserver> weatherObservers;
	int temperature;

	public WeatherStation(int temperature) {
		weatherObservers = new HashSet<IWeatherObserver>();
		this.temperature = temperature;
	}

	@Override
	public void addObserver(IWeatherObserver weatherObserver) {
		weatherObservers.add(weatherObserver);		
	}

	@Override
	public void removeObserver(IWeatherObserver weatherObserver) {
		weatherObservers.remove(weatherObserver);
	}

	@Override
	public void doNotify() {
		Iterator<IWeatherObserver> it = weatherObservers.iterator();
		while (it.hasNext()) {
			IWeatherObserver weatherObserver = it.next();
			weatherObserver.doUpdate(temperature);
		}
	}
	
	public void setTemperature(int newTemperature) {
		System.out.println("\nWeather station setting temperature to " + newTemperature);
		temperature = newTemperature;
		doNotify();
	}

}
