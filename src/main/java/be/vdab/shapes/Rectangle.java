package be.vdab.shapes;

public class Rectangle extends Shape {
	public double height;
	public double width;

	public Rectangle(String name, double height, double width) {
		super(name);
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		double area = height*width;
		return area;
	}

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}
