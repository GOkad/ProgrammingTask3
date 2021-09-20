package dev.okadarov.programmingtask3;

abstract class GeometricFigure {
	public double perimeter;
	public double area;
	
	public abstract double calculatePerimeter( );
	
	public abstract double calculateArea();
	
	// Display calculated values method
		public void displayCalculatedValues ( ) {
			System.out.println("The Perimeter is : "+this.perimeter+" cm");
			System.out.println("The Area is : "+this.area+" cm²");
			System.out.println("\n\n");
		}
	
}
