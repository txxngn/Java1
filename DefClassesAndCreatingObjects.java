package Week12;

public class DefClassesAndCreatingObjects {
    public static void main (String [] args){
        SimpleCircle circle1 = new SimpleCircle(); //Creating OBJECT (circle1) using default constructor
        // SimpleCircle() is constructor, constructor is a special method

        //Setting value of the variable of "SimpleCircle" Class using "circle1" object created above

        circle1.radius = 50;
        System.out.println("The area of the circle of radius " +circle1.radius + " is");
        double a = circle1.getArea(); //saving the returned are in the variable "a" using "circle1" object
        System.out.println(a);

    }
}

//Define the circle class with data and method
class SimpleCircle{
    double radius; //data
    double getArea() { //Method           //k co static nen can OBJECT name de access (nonstatic method)
        double area = radius*radius*3.14;
        return area;
    }
        }