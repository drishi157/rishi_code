package com.a.two;

public class ExecteMainClass {

	public static void main(String[] args) 
	{
		// behaviours of duck
		Duck duck = new Duck();
		duck.setFlying(new HavingWings());
		duck.getFlying().fly();
		duck.setSoundIn(new SoundOfDuck());
		duck.getSoundIn().sound();
		duck.setSwiming(new DuckSwim());
		duck.getSwiming().swim();
		//		duck.walk();

		// behaviours of chicken
		Chicken chicken = new Chicken();
		chicken.setFlying(new NoWings());
		chicken.getFlying().fly();
		chicken.setSoundIn(new ChickenSound());
		chicken.getSoundIn().sound();
		chicken.setSwiming(new ChickenSwim());
		chicken.getSwiming().swim();

	}

}
