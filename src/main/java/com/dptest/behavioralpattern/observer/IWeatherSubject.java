package com.dptest.behavioralpattern.observer;

public interface IWeatherSubject {
	
	public void addObserver(IWeatherObserver weatherObserver);

	public void removeObserver(IWeatherObserver weatherObserver);

	public void doNotify();

}
