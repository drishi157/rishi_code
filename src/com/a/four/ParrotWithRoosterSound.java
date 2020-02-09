package com.a.four;

public class ParrotWithRoosterSound implements SoundInterface {

	@Override
	public String sound() {
		String whatSound = "Cock-a-doodle-doo";
		System.out.println(whatSound);
		return whatSound;
	}

}
