
abstract class Shape {
	public abstract double area();
}

class Triangle extends Shape {
	private double width;
	private double height;
	public Triangle(double w, double h) {
		width = w;
		height = h;
	}
	public double area() {
		return 0.5*width*height;
	}
}

class Rectangle extends Shape {
	private double width;
	private double height;
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	public double area() {
		return width*height;
	}
}

class Circle extends Shape {
	private double radius;
	public Circle(double r) { radius = r; }
	public double area() {
		return radius*radius*3.141592;
	}
}

public class AbstractClass {

	
	public static void main(String argv[]) {
		Triangle A = new Triangle(3,10);
		Rectangle B = new Rectangle(4,3);
		Circle C = new Circle(4);
		
		System.out.println("Area of Triangle A = "+A.area());
		System.out.println("Area of Rectangle B = "+B.area());
		System.out.println("Area of Circle C = "+C.area());
		
		System.out.println("Diff. of A and B = "+diff(A,B));
		System.out.println("Diff. of A and C = "+diff(A,C));
		System.out.println("Diff. of B and C = "+diff(B,C));
		
		System.out.println("Sum of A and B = "+sum(A,B));
		System.out.println("Sum of A and C = "+sum(A,C));
		System.out.println("Sum of B and C = "+sum(B,C));
	}
	
	private static double diff(Shape a, Shape b) {
		return Math.abs(a.area()-b.area());
	}
	
	
	private static double sum(Shape a, Shape b) {
		return Math.abs(a.area()+b.area());
	}
}
