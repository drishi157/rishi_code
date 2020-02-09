package com.a.two;

public class DuckSwim implements SwimInterface 
{

	@Override
	public String swim() {
		String canFly = "A Duck can Swim";
		System.out.println(canFly);
		return "canFly";
	}
	
	
}
