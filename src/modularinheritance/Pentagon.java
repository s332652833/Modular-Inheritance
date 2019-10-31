package modularinheritance;

/**
 *
 * @author Arup
 */
public class Pentagon extends Shape {
    public Pentagon(double side){   
        //the area formula for a pentagon is A = o.25* sqrroot(5*(5+2*sqrroot5))* length^2
        this.area = (0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*(side*side));
        this.perimeter = (5*side);
    }
}
