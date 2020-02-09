package com.a.three;

public class HavingWings implements FlyInterface 
{

	@Override
	public String fly() {
		String canFly = "A Rooster can FLY";
		System.out.println(canFly);
		return canFly;
	}

}
