package com.dptest.structuralpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeWindow implements IWindow {
	
	List<IWindow> iWindow = new ArrayList<IWindow>();

	@Override
	public void fill() {
		for (IWindow window : iWindow) {
			window.fill();
		}
	}
	
	public void add(IWindow win) {
		iWindow.add(win);
	}

	@Override
	public void removeFill() {
		for (IWindow window : iWindow) {
			window.removeFill();
		}
	}

}
