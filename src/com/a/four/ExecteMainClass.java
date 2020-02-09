package com.a.four;

public class ExecteMainClass {

	public static void main(String[] args) 
	{
		// behaviours of Parrot
		Parrot rooster = new Parrot();
		rooster.setSoundIn(new ParrotWithDogSound());
		rooster.getSoundIn().sound();
		
		rooster.setSoundIn(new ParrotWithCatSound());
		rooster.getSoundIn().sound();
		
		rooster.setSoundIn(new ParrotWithRoosterSound());
		rooster.getSoundIn().sound();
		
		rooster.setSoundIn(new ParrotWithAnyObjectOrLivingThings());
		rooster.getSoundIn().sound();
		
		

	}

}
