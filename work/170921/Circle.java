public class Circle extends Shape {

	private double radius;

	public Circle() {
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public void calculationArea() {
		setArea((double)radius*radius*Math.PI);
	}

	public void print() {
		System.out.println("원의 면적은 "+getArea());
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
}