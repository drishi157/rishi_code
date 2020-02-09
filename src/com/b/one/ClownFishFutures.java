package com.b.one;

public class ClownFishFutures extends FishCommonBehaviors implements FishFuturesImplementaion{

	
	@Override
	public String sizeAndColor() {
		String colorSize = "Clownfish are small and colourful";
		System.out.println(colorSize);
		return colorSize;
	}

	@Override
	public String fishbehavior() {
		String behavior = "Clownfish make jokes";
		System.out.println(behavior);
		return behavior;
	}

}
