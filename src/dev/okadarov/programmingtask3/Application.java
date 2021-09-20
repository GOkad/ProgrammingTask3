package dev.okadarov.programmingtask3;

import java.util.Scanner;

public class Application {
	public static Scanner scanner;
	public static void main(String[] args) {
		
		scanner =  new Scanner(System.in);
		
		System.out.println("Please input values for creating a triangle :");
		double a = getUserInput( "a" );
		double b = getUserInput( "b" );
		double c = getUserInput( "c" );
		Triangle triangle = new Triangle( a,b,c );
		triangle.displayCalculatedValues( );
		
		System.out.println("Please input values for creating a rectangle :");
		a = getUserInput( "a" );
		b = getUserInput( "b" );
		Rectangle rectangle= new Rectangle( a,b );
		rectangle.displayCalculatedValues( );
		
		System.out.println("Please input values for creating a cirlce :");
		double r = getUserInput( "the radius of the circle" );
		Circle circle = new Circle( r );
		circle.displayCalculatedValues( );
		
	}
	
	public static double getUserInput ( String variableName ) {
		System.out.println("Please select a value for "+variableName+" (cm) : ");
		double returnValue = 0; 
		// Validate user input
			while ( returnValue == 0 ) {
				String userInput =  scanner.nextLine( );
				try	{
					// Parse user data to Double
					returnValue = Double.parseDouble(userInput);
					if ( returnValue <= 0 ) {
						returnValue = 0;
						System.out.println("Please input a number higher than 0!");
					}
				} catch ( NumberFormatException e ) {
					System.out.println("Please input a valid number! "+returnValue);
				}
			}
		return returnValue;
	}
	
}
