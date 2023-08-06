package Week12;

import org.w3c.dom.ls.LSOutput;

public class Pract1 {
    public static void main (String [] args){
        /*
        WAP to create the following class and objects
        Animal : Age; Gender. printAge(int); printGender(String)
        Dog: Animal. Age = 12; Gender = "Male"
        Cat: Animal. Age = 2; Gender = "Female"
         */
        Animal dog = new Animal();
        Animal cat = new Animal();
        dog.age = 12;
        dog.gender = "Male";
        cat.age = 2;
        cat.gender = "Female";
        System.out.println("Dog age is " + dog.age + " and gender is " +dog.gender );
        System.out.println("Cat age is " + cat.age + " and gender is " +cat.gender );
        System.out.println();


        //Use other class with constructor
        AnimalWithConstructor dog1 = new AnimalWithConstructor(13, 'M');
        System.out.println("Dog age is " + dog1.age + " and gender is " +dog1.gender);
        AnimalWithConstructor cat1 = new AnimalWithConstructor(4, 'F');
        System.out.println("Car age is " + cat1.age + " and gender is " +cat1.gender);

    }
}
class Animal{
    int age;
    String gender;


}

//Or more advance is using the constructor
class AnimalWithConstructor{
    int age;
    char gender;
    AnimalWithConstructor (int newAge, char newGender){
        age = newAge;
        gender = newGender;

    }

}
