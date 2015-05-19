package be.vdab.shapes;

public class Triangle extends Shape {
	public double base;
	public double height;

	public Triangle(String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
	}


	@Override
	public double area() {
		double area = (base*height)/2;
		return area;
	}

    @Override
    double perimeter() {
        return base * base / height * height;
    }
}
