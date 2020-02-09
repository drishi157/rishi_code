package com.a.four;

public class ParrotWithAnyObjectOrLivingThings implements SoundInterface {

	@Override
	public String sound() {
		String whatSound = "sound of either objects or living things";
		System.out.println(whatSound);
		return whatSound;
	}

}
