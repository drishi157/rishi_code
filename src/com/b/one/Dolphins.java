package com.b.one;

public class Dolphins implements FishCommonBehaviorsImplementaion
{
	
	@Override
	public String canSing() {
		String sing= "Dolphins dont Sing";
		System.out.println(sing);
		return sing;
	}

	@Override
	public String canWalk() {
		String walk= "Dolphins dont walk";
		System.out.println(walk);
		return walk;
	}

	@Override
	public String canSwim() {
		String swim= "Dolphins they are good swimmers";
		System.out.println(swim);
		return swim;
	}
	
}
