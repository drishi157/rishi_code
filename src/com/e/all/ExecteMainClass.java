package com.e.all;


public class ExecteMainClass {

	public static void main(String[] args) 
	{
		Animal[] animal = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolhpin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};
		
		processCount(animal);
		
	}

	private static void processCount(Animal[] animal) 
	{
		int flyCount = 0;
		int walkCount = 0;
		
		int singCount = 0;
		int swimCount = 0;
		
		
		for(int i = 0 ; i< animal.length; i++)
		{
			if(animal[i].fly()){
				flyCount = flyCount + 1;
			}
			if(animal[i].sing()){
				singCount = singCount + 1;
			}
			if(animal[i].walk()){
				walkCount = walkCount + 1;
			}
			if(animal[i].swim()){
				swimCount = swimCount + 1;
			}
		}
		System.out.println("how many of these animals can fly?: "+flyCount);
		System.out.println("how many of these animals can walk?: "+walkCount);
		System.out.println("how many of these animals can sing?: "+singCount);
		System.out.println("how many of these animals can swim?: "+swimCount);
	}
	}


