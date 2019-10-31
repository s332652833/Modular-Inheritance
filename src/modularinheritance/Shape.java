package modularinheritance;

/**
 *
 * @author S332652833
 */
public class Shape {
    public double area, perimeter;

    public Shape(){

    }
    //Sets value of area based on sub class
    public void AreaValue(double ar){
        this.area = ar;
    }
    //Sets value of perimeter based on sub class
    public void PerimeterValue(double per){
        this.perimeter = per;
    }
    //Prints the area
    public void printArea() {
        System.out.println("The area of the shape is " + Math.round(area));
    }
    //Prints the perimeter
    public void printPerimeter() {
        System.out.println("The perimeter of the shape is " + Math.round(perimeter));
    }
    }