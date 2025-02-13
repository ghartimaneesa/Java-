// Interface Question
// Write a Java programming to create a banking system with three classes -
// Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them.
// Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
// SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.


package Interface;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        int amount = scanner.nextInt();
        savingAccount.deposit(amount);
        System.out.println("Enter the amount to withdraw:");
        int amount1 = scanner.nextInt();
        savingAccount.withdraw(amount1);
        savingAccount.viewBalance();

        CurrentAccount currentAccount = new CurrentAccount();

        System.out.println("Enter principle:");
        int p = scanner.nextInt();
        System.out.println("Enter time:");
        int t = scanner.nextInt();
        System.out.println("Enter Rate");
        int r = scanner.nextInt();

        currentAccount.calculateInterest(p,t,r);


    }
}

interface Account{



    void deposit(int amount);

    void withdraw(int amount);

    void calculateInterest(float p, float t, float r);

    void viewBalance();

}

class SavingAccount implements Account{
    int balance;
    @Override
    public void deposit(int amount) {



        if(amount!=0){
            balance = balance + amount;
            System.out.println("Deposited" + amount);
        }
        else{
            System.out.println("Invalid Deposit");
        }

    }

    @Override
    public void withdraw(int amount) {

        if(amount !=0 && amount<= balance){
            System.out.println("Withdrawn" + amount);
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient amount ");
        }


    }

    @Override
    public void calculateInterest(float p, float t, float r) {

    }

    @Override
    public void viewBalance() {

        System.out.println("The balance is:" + balance);

    }
}

class CurrentAccount implements Account{

    float SI;

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void calculateInterest(float p,float t, float r) {

        SI = (p * t * r)/100;
        System.out.println("Simple Interest is:" + SI);

    }

    @Override
    public void viewBalance() {

    }
}

