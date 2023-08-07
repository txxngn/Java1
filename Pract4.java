package Week12;

public class Pract4 {
    public static void main (String [] args) {
        /*
        7.	WAP corresponding to the following class diagram.
        School
        - ID: int
        - Name: String
        + setID(int):  void
        + setName(String): void
        + getID(): int
        + getName(): String
         */
        int ID = 123456;
        String Name = "Mark";
        School a = new School();
        a.setID(ID);
        a.setName(Name);
        System.out.println("Student " + a.getName() + " has ID " + a.getID());


    }
}
class School{
    private int ID;
    private String Name;
    public void setID(int id){

        this.ID=id;
    }
    public void setName(String name){

        this.Name=name;
    }
    public int getID(){

        return this.ID;
    }
    public String getName(){

        return this.Name;
    }

}

