package modularinheritance;

import java.util.Scanner;

/**
 *
 * @author S332652833
 */
public class Triangle extends Shape {
    
    public Triangle(double base, double height, double aside, double cside){
        this.area = (base*height)/2;
        this.perimeter = (aside+base+cside);
    }
}