package com.a.four;

public class ParrotWithCatSound implements SoundInterface {

	@Override
	public String sound() {
		String whatSound = "Meow";
		System.out.println(whatSound);
		return whatSound;
	}

}
