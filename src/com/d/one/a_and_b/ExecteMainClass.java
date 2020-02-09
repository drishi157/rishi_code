package com.d.one.a_and_b;

public class ExecteMainClass {

	public static void main(String[] args) 
	{
		// behaviours of Butterfly
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
		butterfly.sound();
		
		// behaviours of Caterpillar
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.caterpillarToButterfly();
		
	}

}
