package com.a.three;

public class TypeOFChicken implements ISChickenOrRooster
{

	@Override
	public String checkGender(String birdType) {
		
		String whatGender;
				if(birdType.equalsIgnoreCase("rooster"))
				{
					whatGender = "Male";
				}
				else
				{
					whatGender = "Female";
				}
				
				System.out.println(whatGender);
		return whatGender;
	}

}
