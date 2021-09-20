package dev.okadarov.programmingtask3;

public class Triangle extends GeometricFigure {
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.perimeter = this.calculatePerimeter();
		this.area = this.calculateArea();
	}
	@Override
	public double calculatePerimeter() {
		return a+b+c; 
	}
	@Override
	public double calculateArea() {
		double p = this.perimeter/2;
		return Math.sqrt( p*(p-this.a)*(p-this.b)*(p-this.c) );
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
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
}
