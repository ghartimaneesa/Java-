//6.Write a Java program to create a Animal interface with a method called bark()
// that takes no arguments and returns void.
// Create a Dog class that implements Animal
// and overrides speak() to print "Dog is barking".

package Interface;

public interface Animal {

    void bark();
    void speak();

}

class  Dog implements Animal{
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void speak() {

        System.out.println("Dog is speaking");

    }
}

class Main1{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.speak();
    }
}


