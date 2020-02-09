package com.a.three;

import com.a.three.FlyInterface;
import com.a.three.SoundInterface;

public class Rooster 
{
	private SoundInterface soundIn;
	private FlyInterface flying;
	private ISChickenOrRooster chickenOrRooster;
	
	public ISChickenOrRooster getChickenOrRooster() {
		return chickenOrRooster;
	}
	public void setChickenOrRooster(ISChickenOrRooster chickenOrRooster) {
		this.chickenOrRooster = chickenOrRooster;
	}
	public SoundInterface getSoundIn() {
		return soundIn;
	}
	public void setSoundIn(SoundInterface soundIn) {
		this.soundIn = soundIn;
	}
	public FlyInterface getFlying() {
		return flying;
	}
	public void setFlying(FlyInterface flying) {
		this.flying = flying;
	}
}
