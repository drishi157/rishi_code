package com.b.one;

public class SharkFishFeatures extends FishCommonBehaviors implements FishFuturesImplementaion
{

	@Override
	public String sizeAndColor() {
		String colorSize = "Sharks are large and grey";
		System.out.println(colorSize);
		return colorSize;
	}

	@Override
	public String fishbehavior() {
		String behavior = "Sharks eat other fish";
		System.out.println(behavior);
		return behavior;
	}
	
}
