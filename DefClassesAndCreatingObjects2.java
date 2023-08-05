package Week12;

public class DefClassesAndCreatingObjects2 {
    public static void main (String [] args){
        SimpleCircle1 circle1 = new SimpleCircle1(); //Creating object using default constructor, constructor doesnt need to be called, when create object, constructor is called automatically
        System.out.println("The area of the circle of radius " +circle1.radius+ " is " + circle1.getArea());

        //Modify circle radius
        circle1.radius = 100; //or circle2.setRadius(100)
        System.out.println("The area of the circle of radius " + circle1.radius+ " is " + circle1.getArea());
    }
}


//Define the circle class with one constructor
class SimpleCircle1{
    double radius;
    SimpleCircle1(){ //Default Constructor
        radius = 1;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}