package Week12;

public class GetSet {
    public static void main (String [] args){
        int age = 22;
        String name = "Mark";
        Student s = new Student();
        s.setAge(age);
        s.setName(name);
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}

class Student{
    private int age;
    private String name;
    public void setAge(int a){
        this.age = a;
    }
    public void setName(String s){
        this.name = s;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }



}
