package Car;

public class Car {


    private String model;

    private static String make;

    private int year;

    private double price;

    private String color;

    private boolean state;

    private static int counter;


    static {
        counter = 0;
        make = "tesla";
    }

    {
        counter++;
    }

     public Car(String model, String make, String color, int year, double price, boolean state){

        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
        this.price = price;
        this.state = state;


    }

    Car(){
        make = "m";
        model = "tesla";
        year = 1990;
        price = 90000;
        color = "black";
    }
;;


    void showDetails(){

        System.out.println("model of the car is" + model);
        System.out.println("year of the car is" + year);
        System.out.println("make of the car is" + make);
        System.out.println("price of the car is" + price);
        System.out.println("color of the car is" + color);
        System.out.println("color of the car is" + state);


    }


    void changeState(){

        if(state == true){
            state = false;
        }
        else {
            state = true;
        }

    }

    void changecompanyName(String companyName){

        this.make = companyName;

    }

   static void countCar(){

        System.out.println("total no of car"+counter);

    }

    public static void main(String[] args) {

        Car.countCar();

        Car c1 = new Car();
        c1.showDetails();

        Car c2 = new Car();
            c2.showDetails();

        Car c3 = new Car();
        c3.showDetails();

        Car c4 = new Car("model5", "m", "black",1900, 9000, false);

        c4.changeState();
        c4.showDetails();
        Car.countCar();

        c4.changecompanyName("honda");
        c4.showDetails();



    }
}
