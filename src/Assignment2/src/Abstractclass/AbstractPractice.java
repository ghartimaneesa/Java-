//// Abstract Class Question
//1. Write a Java program to create an abstract class Employee
// with abstract methods calculateSalary() and displayInfo().
// Create subclasses Manager and Programmer that extend the Employee class
// and implement the respective methods to calculate salary and display information for each role.

package Abstractclass;

import java.util.Scanner;

public class AbstractPractice {
    public static void main(String[] args) {


        Manager manager = new Manager();
        manager.calculateSalary();
        manager.displayInfo();
    }
}

abstract class Employee{

    int salary;

    abstract void calculateSalary();

    abstract void displayInfo();



}

class Manager extends Employee{

    @Override
    void calculateSalary() {
        System.out.println("Enter the Salary of the Manager");
        Scanner scanner = new Scanner(System.in);
        salary = scanner.nextInt();

    }

    @Override
    void displayInfo() {

        System.out.println("The salary of the manager is: " + salary);

    }
}

class Programmer extends Employee{

    @Override
    void calculateSalary() {

        System.out.println("This is your Salary");

    }

    @Override
    void displayInfo() {

        System.out.println("This is your information");

    }
}
