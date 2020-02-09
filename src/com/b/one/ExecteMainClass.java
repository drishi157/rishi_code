package com.b.one;

public class ExecteMainClass {

	public static void main(String[] args) 
	{
		// behaviours of Fish
		Fish fish = new Fish();
		fish.setFishBehav(new FishCommonBehaviors());
		fish.getFishBehav().canSing();
		fish.getFishBehav().canWalk();
		fish.getFishBehav().canSwim();
		
		
		// behaviours of Clown Fish
		ClownFish clownfish = new ClownFish();
		clownfish.setFishBehav(new FishCommonBehaviors());
		clownfish.getFishBehav().canSing();
		clownfish.getFishBehav().canWalk();
		clownfish.getFishBehav().canSwim();
		
		clownfish.setFishFeatures(new ClownFishFutures());
		clownfish.getFishFeatures().sizeAndColor();
		clownfish.getFishFeatures().fishbehavior();
		
		
		// behaviours of Shark Fish
		SharkFish sharkfish = new SharkFish();
		sharkfish.setFishFeatures(new SharkFishFeatures());
		sharkfish.getFishFeatures().sizeAndColor();
		sharkfish.getFishFeatures().fishbehavior();
		
		// behaviours of Dolphins
		
		Dolphins dp = new Dolphins();
		dp.canSwim();
				

	}

}
