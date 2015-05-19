package be.vdab.shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}
