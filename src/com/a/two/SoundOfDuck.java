package com.a.two;

public class SoundOfDuck implements SoundInterface {

	@Override
	public String sound() {
		String whatSound = "Quack, quack";
		System.out.println(whatSound);
		return whatSound;
	}
	
	

}
