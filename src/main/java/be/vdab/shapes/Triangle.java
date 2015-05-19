package be.vdab.shapes;

public class Triangle extends Shape {
    private double[] sides;

    public Triangle(String name, double[] sides) {
        super(name);
        this.sides = sides;
    }

    @Override
    double perimeter() {
        double perimter = 0;
        for (double side : sides) {
            perimter += side;
        }
        return perimter;
    }
}
