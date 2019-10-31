package modularinheritance;

/**
 *
 * @author S332652833
 */
public class Circle extends Shape {
    public Circle(double radius){
        this.area = (Math.PI*radius*radius);
        this.perimeter = (Math.PI*2*radius);
    }
}
