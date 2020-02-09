package com.a.two;

public class Duck {
	
	
	private SoundInterface soundIn;
	private SwimInterface swiming;
	private FlyInterface flying;
	
	public SoundInterface getSoundIn() {
		return soundIn;
	}
	public void setSoundIn(SoundInterface soundIn) {
		this.soundIn = soundIn;
	}
	public SwimInterface getSwiming() {
		return swiming;
	}
	public void setSwiming(SwimInterface swiming) {
		this.swiming = swiming;
	}
	public FlyInterface getFlying() {
		return flying;
	}
	public void setFlying(FlyInterface flying) {
		this.flying = flying;
	}
	
	

}
