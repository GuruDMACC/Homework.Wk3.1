package edu.dmacc.codedsm.mathproj;

import java.util.Random;

public class mathProj {

	public static void main(String[] args) {

		final int X1=27;
		final int X2=28;
		final int X3=5;
		final double X4=2.2;
		
		double sqroot;
		double division; 
		double power;
		int randomNumber;
		
		sqroot = Math.sqrt(X1);
		System.out.println("Square root of 27 is : "+sqroot);
		
		
		division = X2/X3; 
		System.out.println("division of 28/5  is : "+division);
		
		power = Math.pow(X4, 4);
		System.out.println("2.2 power to 4 : "+ power);

//		use random class to get Integer
		Random rand= new Random();
		randomNumber = rand.nextInt();
		System.out.println("Random Number generated :" + randomNumber);
	}

}
