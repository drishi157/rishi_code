package com.a.three;

public class SoundOfRooster implements SoundInterface {

	@Override
	public String sound() {
		
		String whatSound = "Cock-a-doodle-doo"; 
		System.out.println(whatSound);
		return whatSound;
	}

}
