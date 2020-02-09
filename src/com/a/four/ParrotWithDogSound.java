package com.a.four;

public class ParrotWithDogSound implements SoundInterface {

	@Override
	public String sound() {
		String whatSound = "Woof, woof";
		System.out.println(whatSound);
		return whatSound;
	}

}
