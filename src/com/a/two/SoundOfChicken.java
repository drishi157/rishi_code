package com.a.two;

public class SoundOfChicken implements SoundInterface
{

	@Override
	public String sound() {
		
		String soundTest ="Cluck, cluck";
		System.out.println(soundTest);
		return soundTest;
	}

}
