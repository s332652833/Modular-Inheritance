package modularinheritance;

/**
 *
 * @author Arup
 */
public class Parallelogram extends Shape {
    public Parallelogram(double base, double height, double side){
        this.area = (base*height);
        this.perimeter = (2*base + 2*side);
    }
}
