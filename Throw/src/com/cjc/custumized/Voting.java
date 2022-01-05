package com.cjc.custumized;

public class Voting {
	
	public static void main(String[] args) throws YoungerAgeException {
		int age=16;
		if(age<18)
		{
			throw new YoungerAgeException("You are not eligible for voting");
		}
		else
		{
			System.out.println("You are eligible for voting");
		}
	}

}
