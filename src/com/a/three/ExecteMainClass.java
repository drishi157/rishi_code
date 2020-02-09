package com.a.three;

public class ExecteMainClass {

	public static void main(String[] args) 
	{
		// behaviours of Rooster
		Rooster rooster = new Rooster();
		rooster.setFlying(new HavingWings());
		rooster.getFlying().fly();
		rooster.setSoundIn(new SoundOfRooster());
		rooster.getSoundIn().sound();
		
		rooster.setChickenOrRooster(new TypeOFChicken());
		rooster.getChickenOrRooster().checkGender("rooster");

	}

}
