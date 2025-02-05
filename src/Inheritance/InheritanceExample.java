package Inheritance;

/**
code Reusability

 **/

public class InheritanceExample {

    public static void main(String[] args) {

       Dog dog = new Dog("BlackDog",9,"sadasd");
        System.out.println(dog.age);
        dog.eat();


    }


}
//Superclass / Parent Class
//it doesn't contain child property

class Animal {

    String name;

    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}
    //Subclass
    
class Dog extends Animal{

        String breedType;

        Dog(String name, int age,String breedType) {
            
            super(name, age);
            this.breedType = breedType;

        }
        //Method overriding
       //if the base class and child class have the same method with the same data type then it is known as method overriding
        @Override
        public void eat(){
            System.out.println("Dog is Eating");
        }



}


//Single inheritance = one super class one child
//Multilevel inheritance = super ->child1 ->child2
//Multiple inheritance = it doesn't support on java, but it can be done by using interface.

