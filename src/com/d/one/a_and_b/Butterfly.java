package com.d.one.a_and_b;

public class Butterfly implements FlyInterface,SoundInterface
{
	
	@Override
	public String fly() {
		String canFly ="A butterfly can fly";
		System.out.println(canFly);
		return canFly;
	}

	@Override
	public String sound() {
		
		String whatSound = "A butterfly does not make a sound";
		System.out.println(whatSound);
		return whatSound;
	}
}
