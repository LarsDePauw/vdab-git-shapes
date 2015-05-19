package be.vdab.shapes;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }
    
    public abstract double area();
    
    @Override
    public String toString() {
        return "Shape '" + name + " ' has an area of " + this.area() + " units and a perimeter of " + perimeter() + " units";
    }

    abstract double perimeter();
}
