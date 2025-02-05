package Bank_Application;

import java.util.Scanner;

public class Bank_App {

    String customer_Id;

    String customerName;

    int balance;

    int previousTransaction;

     float p;

     float t;

     float r;

     double si;




    public Bank_App(String customer_ID, String customerName) {
        this.customer_Id = customer_ID;
        this.customerName = customerName;

    }

    public Bank_App(float p, float t, float r){

        this.p= p;
        this.r = r;
        this.t = t;

    }

    public void deposit(int amount) {

        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }

    }

    public void withdraw(int amount) {

        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;

        }
    }
        public void getPreviousTransaction() {

            if (previousTransaction > 0) {
                System.out.println("Deposited" + previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("Withdraw" + Math.abs(previousTransaction));
            } else {
                System.out.println("No Transaction Occured");

            }
        }

        public void getSimpleInterest(){

        si = (p * t * r)/100;
        }



    public void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome" + customerName);
        System.out.println("your Customer ID is" + customer_Id);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Calculate Simple Interest");
        System.out.println("F: Exit");

        do {

            System.out.println("**************");
            System.out.println("Enter a option");
            option = scanner.next().charAt(0);


            switch (option) {
                case 'A':
                    System.out.println("************");
                    System.out.println("Your Current balance is" + balance);
                    break;
                case 'B':
                    System.out.println("***********");
                    System.out.println("Enter the amount to Deposit");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("****************");
                    System.out.println("Enter the amount to withdraw");
                    int amount1 = scanner.nextInt();
                    withdraw(amount1);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("***********");
                    getPreviousTransaction();
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("*********");
                    getSimpleInterest();

                    System.out.println("Simple interest"+si);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        while (option != 'E');


    }
}