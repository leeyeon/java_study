public class Rectangular extends Shape{

	private double width;
	private double height;

	public Rectangular() {
	}

	public Rectangular(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public void calculationArea() {
		setArea((double)width*height);
	}

	public void print() {
		System.out.println("���簢���� ������ "+getArea());
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
}