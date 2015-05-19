package be.vdab.shapes;

/**
 * Exercise:
 *  - Organise yourselves in teams of two members<br/><br/>
 *  - Start from the same (shared) repository version<br/><br/>
 *  - Team member one:<br/>
 *      * Add a new abstract method "double Shape.area()". Make sure all subclasses implement the contract.<br/>
 *      * Modify Shape.toString() to also print out the area of the shape ("Shape 'Triangle' has an area of 12 square units")<br/><br/>
 *  - Team member two:<br/>
 *      * Add a new abstract method "double Shape.perimeter()". Make sure all subclasses implement the contract.<br/>
 *      * Modify Shape.toString() to also print out the perimeter of the shape ("Shape 'Triangle has a perimeter of 16 units")<br/><br/>
 * - Make sure you commit these changes to the local repository<br/><br/>
 * - Push the changes to the origin<br/>
 *      * Do you encounter any problems? What about your team member?<br/>
 *      * Who was the first to push his/her changes to the origin?<br/>
 */
public class Main {
    private static Shape[] shapes = {
        new Rectangle("Rectangle one", 100, 50),
        new Triangle("Triangle one", new double[] {10, 20, 30})
    };

    public static void main(String[] args) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
