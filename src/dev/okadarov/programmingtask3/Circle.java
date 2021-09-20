package dev.okadarov.programmingtask3;

public class Circle extends GeometricFigure {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
		this.perimeter = this.calculatePerimeter( );
		this.area = this.calculateArea( );
	}

	@Override
	public double calculatePerimeter() {
		return Math.PI*(2*r);
	}

	@Override
	public double calculateArea() {
		return Math.PI*Math.pow(r,2);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	
}
