package com.a.two;

public class HavingWings implements FlyInterface 
{

	@Override
	public String fly() {
		String canFly = "A Duck can FLY";
		System.out.println(canFly);
		return canFly;
	}

}
