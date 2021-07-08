package com.galaxe.core;

public class DemoEx {
	// class can be abstract or final, cannot be synchronized

	public static DemoEx instance = null;

	private DemoEx() {
	}

	// NOT GOOD FOR PERFORMANCE!
//	public static synchronized DemoEx getInstance() {
//		if (instance == null) {
//			instance = new DemoEx();
//		}
//		return instance;
//	}

	// BETTER PERFORMANCE
	public static DemoEx getInstance() {
		synchronized(instance) {
			if(instance == null) {
				instance = new DemoEx();
			}
		}
		return instance;
	}

}
