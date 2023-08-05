package Week12;

public class DefClassesAndCreatingObjects3 {
    public static void main (String [] args){
        SimpleCircle3 circle1 = new SimpleCircle3(); //Creating object using default constructor
        System.out.println("The area of the circle of radius " +circle1.radius+ " is " + circle1.getArea());

        SimpleCircle3 circle2 = new SimpleCircle3(25); //Create a circle with radius 25
        System.out.println("The area of the circle of radius " +circle2.radius+ " is " + circle2.getArea());
        circle2.radius = 100; //or circle2.setRadius(100)
        System.out.println("The area of the circle of radius " + circle2.radius+ " is " + circle2.getArea());
    }
}


//Define the circle class with 2 constructors
class SimpleCircle3{
    double radius;
    SimpleCircle3(){ //Default Constructor
        radius = 1;
    }

    SimpleCircle3 (double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}

