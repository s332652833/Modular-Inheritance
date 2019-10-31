package modularinheritance;

/**
 *
 * @author S332652833
 */
public class Rectangle extends Shape {
    public Rectangle(double length, double width){
        this.area = (length*width);
        this.perimeter = (2*length + 2*width);
    }

}
