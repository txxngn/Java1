package Week12;

public class Pract2 {
    public static void main (String [] args){
        Animal1 dog = new Animal1();
        dog.printAge(12);
        dog.printGender("Male");


        Animal1 cat = new Animal1();
        cat.printAge(3);
        cat.printGender("Female");
    }
}
class Animal1{
    int age;
    String gender;
    void printAge (int newAge){
        age=newAge;
        System.out.println("Age is " +age);
    }

    void printGender(String newGender){
        gender = newGender;
        System.out.println("Gender is " +gender);
    }
}