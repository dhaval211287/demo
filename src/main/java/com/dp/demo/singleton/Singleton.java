package com.dp.demo.singleton;

import org.springframework.stereotype.Component;

@Component
public class Singleton {
	//private constructor
	private Singleton() {}
	//singleton instance
	private static Singleton firstInstance = null;

	//global access point
	public Singleton getInstance() {
		if (firstInstance == null) {
			firstInstance = new Singleton();
		}
		return firstInstance;
	}
}
