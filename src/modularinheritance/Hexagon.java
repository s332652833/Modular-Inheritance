package modularinheritance;

/**
 *
 * @author Arup
 */
public class Hexagon extends Shape{
    public Hexagon(double side){
    //area formula for hexagon is (3*sqrroot3)/2 * length^2
    this.area = (3*Math.sqrt(3))/2 *(side*side);
    this.perimeter = (6*side);
    }
}
