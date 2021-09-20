package dev.okadarov.programmingtask3;

public class Rectangle extends GeometricFigure {
	private double a;
	private double b;
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
		this.perimeter = this.calculatePerimeter( );
		this.area = this.calculateArea( );
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*a+2*b;
	}
	@Override
	public double calculateArea() {
		return a*b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	

}
