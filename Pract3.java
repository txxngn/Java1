package Week12;

public class Pract3 {
    public static void main (String [] args){
        /*Create a Java class called BankAccount with the following specifications:
            *The class should have two private data members: accountNumber of type String and balance of
type double.
            *The class should have a constructor that takes two parameters: an accountNumber of type
String and an initialBalance of type double. The constructor should initialize the
accountNumber and balance data members with the provided values.
            *The class should have a public getter method for accountNumber called getAccountNumber(),
which should return the account number as a String.
            *The class should have a public getter method for balance called getBalance(), which should
return the balance as a double.
            *The class should have a public method called deposit() that takes a double parameter
representing the amount to deposit. The method should add the deposit amount to the current
balance.
            *The class should have a public method called withdraw() that takes a double parameter
representing the amount to withdraw. The method should subtract the withdrawal amount from
the current balance, but only if the withdrawal amount is less than or equal to the current
balance. If the withdrawal amount is greater than the current balance, the method should print
an error message and not modify the balance.
            *Write the code for the BankAccount class that meets the above specifications.
         */

        BankAccount myAccount = new BankAccount ("12345", 1000);
        //myAccount.balance = 2000;  //red because it can't be modified, it's private


        System.out.println("Balance is: " + myAccount.getBalance());   //use method getBalance tp access the balance
        myAccount.deposit(500);
        myAccount.withdraw(200);
        System.out.println(myAccount.getBalance());



    }
}

class BankAccount{
    private String accountNumber;
    private double balance;


    BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }


    public void withdraw(double amount){
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Error");
    }

}

