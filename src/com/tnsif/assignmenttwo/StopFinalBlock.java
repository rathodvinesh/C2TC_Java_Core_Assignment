package com.tnsif.assignmenttwo;

public class StopFinalBlock {
	public static void main(String[] args) {
		try {
			System.out.println("I am inside the try block");
			//For stopping the final block use exit(0) in the try block i.e. we are exiting the JVM
			System.exit(0); //This line is important for not executing finally block.
		}
		
		catch (Exception e) {
			System.out.println("I am inside the catch block");
		}
		
		finally {
			//This block should not execute
			System.out.println("I am inside the finally block");
		}
		
		//This will also not be executed
		System.out.println("Outside of all three blocks");
	}

}
