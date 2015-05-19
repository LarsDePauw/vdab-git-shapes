package be.vdab.shapes;

public abstract class Shape {
    protected String name;
    protected double area;

    public Shape(String name) {
        this.name = name;
    }
    
    public abstract double area();
    
    @Override
    public String toString() {
        return "Shape '" + name + " ' has an area of " + this.area() + " units.";
    }
}
