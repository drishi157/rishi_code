package com.a.two;

public class ChickenSound implements SoundInterface {

	@Override
	public String sound() {

		String whatSound = "Cluck, cluck";
		System.out.println(whatSound);
		return whatSound;
	}

}
