//2. Write a Java program to create an abstract class Vehicle with
// abstract methods startEngine() and stopEngine().
// Create subclasses Car and Motorcycle that extend the Vehicle class
// and implement the respective methods to start and stop the engines for each vehicle type.

package Abstractclass.Vehicless_Birdss;

public class VehicleExample {

    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        car.startEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();

    }
}

abstract class Vehicle{

    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle{

    @Override
    void startEngine() {

        System.out.println("Start car engine");

    }

    @Override
    void stopEngine() {

        System.out.println("Stop  car engine");

    }
}

class Motorcycle extends Vehicle{

    @Override
    void startEngine() {

        System.out.println("Start motorcycle engine");

    }

    @Override
    void stopEngine() {

        System.out.println("Stop motorcycle engine");

    }
}

//3. Write a Java program to create an abstract class Bird
// with abstract methods fly() and makeSound().
// Create subclasses Eagle and Hawk that extend the Bird class and
// implement the respective methods to describe how each bird flies and makes a sound.

abstract class Birds{

    abstract void fly();

    abstract void makeSound();

}
class Eagle extends Birds{

    @Override
    void fly() {

        System.out.println("Eagle is flying");

    }

    @Override
    void makeSound() {

        System.out.println("Eagle is  making sound");

    }
}

class Hawk extends Birds{

    @Override
    void fly() {
        System.out.println("Hawk is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Hawk is making sound");
    }
}

class Test{
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        Hawk hawk = new Hawk();
        hawk.makeSound();
    }
}
