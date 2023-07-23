import java.util.Scanner;
public class ex3 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        //Write a program using Switch statement to print If the character is A,E,I,O, or U,
        //it is vowel otherwise consonant.

        System.out.println("Enter a character: ");
        char char_input = input.nextLine().charAt(0);   //capture ký tự, k phải string


        String statement = switch (char_input) {
            case 'A', 'E', 'I', 'O', 'U' -> "Vowel";   //character nên phải single quote
            default -> "Consonant";
        };

        System.out.println(statement);




        }




    }

