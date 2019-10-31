package modularinheritance;
/**
 *
 * @author S332652833
 */
import java.util.Scanner;

public class ModularInheritance {
    //Variable used to help in setting values of other variables
    public static double x = 0;
    
    //Method to quit program, detects for keyword "quit", used throughout program    
    static void quit(String word) {
        if (word.equalsIgnoreCase("quit")){
            System.out.println("\nHave a good day, Closing program .......\n"
                    + "........................................\n Process Ended");
            System.exit(0);
        }
    }
    //method of a try statement that can be reused for user input for any double variable
    static void check(double num) {
        double t = 1;
        num = 0;
        Scanner sc = new Scanner(System.in);
        while (t==1){
            String input = sc.nextLine();
            //checks for quit
            quit(input);
            try {
               //variable is equal to double value of String
               num = Double.parseDouble(input);
               if (num > 0) {
                  t = 0;
               } else {
                   //if number is not above 0, give error
               throw new NumberFormatException();
               }
                
            }   //When input is not a number/ is not above 0, user recieves an error and must try again
                catch (NumberFormatException e) {
                System.out.println("That's not a valid input. Must be a number above 0 ");
                }
        } 
        //Used to set variable to proper number(was done in two steps to get rid of certain bugs)
        x = num;
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double h = 0;
        double r = 0;

    
        Scanner sc = new Scanner(System.in);
        
        while(true){  
            System.out.println("\nThis program will find the area or perimeter of a shape, type "
                    + "'quit' at any time to exit program");
            System.out.println("What shape would you like to find? Circle, SemiCircle, "
                    + "Triangle, Rectangle, Square, Parallelogram, Pentagon, or Hexagon?");
            String input = sc.nextLine();   
            quit(input);
            //User must choose a shape, if not in list/incorrectly spelt, user recieves error and must try again
            if(input.equalsIgnoreCase("triangle")){
                //For triangle, user must put values for the base, height, and two other side lengths
                System.out.println("What is the length of the base(bottom side)?");
                check(b);
                b = x;

                System.out.println("What is the length of the second side?");
                check(a);
                a = x;

                System.out.println("What is the length of the third side?");
                check(c);
                c = x;

                System.out.println("What is the height?");
                check(h);
                h = x;

                Triangle tri1 = new Triangle(b, h, a, c);
                //Prints area and perimeter
                tri1.printArea();  
                tri1.printPerimeter();
            }    

            else if(input.equalsIgnoreCase("rectangle")) {
                //For rectangle, user inputs values of length(base) and width(height)
                System.out.println("What is the length of the rectangle?");
                check(b);
                b=x;

                System.out.println("What is the width of the rectangle?");
                check(h);
                h=x; 

                Rectangle rect1 = new Rectangle(b, h);
                //Prints area and perimeter
                rect1.printArea();
                rect1.printPerimeter();
            }

            else if(input.equalsIgnoreCase("Square")) {
                //Reuses rectangle sub class, only finds one side length
                System.out.println("What is the side length?");
                check(b);
                b=x;

                Rectangle square1 = new Rectangle(b, b);
                //prints area and perimeter
                square1.printArea();
                square1.printPerimeter();
            }
            //For circle, user inputs values of the radius
            else if(input.equalsIgnoreCase("Circle")) {
                System.out.println("What is the radius?");
                check(r);
                r=x;

                Circle circ1 = new Circle(r);
                circ1.printArea();
                circ1.printPerimeter();
            }
            //Reuses circle subclass and recalculates the area and perimeter based on measurements of a circle, 
            //user inputs values for radius
            else if(input.equalsIgnoreCase("SemiCircle")) {
                System.out.println("What is the radius?");
                check(r);
                r=x;

                Circle semi1 = new Circle(r);
                //Semi circle area is equal to half of a circle
                semi1.area = semi1.area/2;
                //Semi circle perimeter is equal to half of circumference plus the diameter
                semi1.perimeter = (semi1.perimeter/2) + 2*r;
                //prints the area and perimeter
                semi1.printArea();
                semi1.printPerimeter();
            }
            //For parallelogram, user inputs values for base, height, and slant side length
            else if(input.equalsIgnoreCase("Parallelogram")) {
                System.out.println("What is the base?");
                check(b);
                b=x;

                System.out.println("What is the height?");
                check(h);
                h=x;

                System.out.println("What is the length of the slanted side?");
                check(a);
                a=x; 

                Parallelogram gram1 = new Parallelogram(b, h, a);
                //Prints area and perimeter
                gram1.printArea();
                gram1.printPerimeter();
            }
            //For a (regular)pentagon, user inputs value of a side length
            else if(input.equalsIgnoreCase("Pentagon")) {
                System.out.println("What is the side length?");
                check(a);
                a=x;

                Pentagon pent1 = new Pentagon(a);
                //Prints area and perimeter
                pent1.printArea();
                pent1.printPerimeter();
            }    
            //For a (regular)hexagon, user inputs value of a side length
            else if(input.equalsIgnoreCase("Hexagon")) {
                System.out.println("What is the side length?");
                check(a);
                a=x;

                Hexagon hex1 = new Hexagon(a);
                //Prints area and perimeter
                hex1.printArea();
                hex1.printPerimeter();
            }    
            //If user does not choose a valid option, he must try again
            else
                System.out.println("invalid input, make sure it is on the list and has no spaces!");
            }
        }
    }
