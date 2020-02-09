package com.a.two;

public class ChickenSwim implements SwimInterface {

	@Override
	public String swim() {
		String canSwim = "Chicken cannot swim";
		System.out.println(canSwim);
		return canSwim;
	}



}
