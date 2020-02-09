package com.b.one;

public class FishCommonBehaviors implements FishCommonBehaviorsImplementaion{

	@Override
	public String canSing() {
		String sing= "Fishes dont Sing";
		System.out.println(sing);
		return sing;
	}

	@Override
	public String canWalk() {
		String walk= "Fishes dont walk";
		System.out.println(walk);
		return walk;
	}

	@Override
	public String canSwim() {
		String swim= "Fishes can Swim";
		System.out.println(swim);
		return swim;
	}

}
