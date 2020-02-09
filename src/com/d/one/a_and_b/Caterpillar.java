package com.d.one.a_and_b;

public class Caterpillar extends Animal implements FlyInterface
{
	SoundInterface soundIn;
	FlyInterface flyinterface;
	
	public SoundInterface getSoundIn() {
		return soundIn;
	}
	public void setSoundIn(SoundInterface soundIn) {
		this.soundIn = soundIn;
	}
	public FlyInterface getFlyinterface() {
		return flyinterface;
	}
	public void setFlyinterface(FlyInterface flyinterface) {
		this.flyinterface = flyinterface;
	}
	
	
	
	public void caterpillarToButterfly(){
		fly();
		}

		@Override
		public String fly() {
						
			String canFly ="Caterpillar can not fly";
			System.out.println(canFly);
			return canFly;
		}
		
	
}
