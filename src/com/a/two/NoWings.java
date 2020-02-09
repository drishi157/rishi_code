package com.a.two;

public class NoWings implements FlyInterface
{
	@Override
	public String fly() {
		String canFly = "A Chicken cannot Fly";
		System.out.println(canFly);
		return canFly;
	}

}
