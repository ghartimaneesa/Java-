package AbstractClass;

/**
 * Abstraction
 * It only says what to do and hide how it does
 * Security
 * functional Enhancement
 * two ways to achieve abstraction class/interface
 * Abstract class: if we have tp share some common functionality
 * 20%
 * when to use abstract class and interface
 */

abstract class Parent{
    String firstname;
    String lastname;

    Parent(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;

    }

    abstract void career();

    abstract void hobby();

    void buyHome(){
        System.out.println("Buying Home");
    }
}
class Daughter extends Parent{
    Daughter(String firstname, String lastname){
        super(firstname,lastname);
    }

    @Override
    void career() {
        System.out.println("Engineer");
    }

    @Override
    void hobby() {

        System.out.println("Playing Guitar");

    }
}

public class AbstractClassExample {

    public static void main(String[] args) {

        Daughter daughter = new Daughter("Manisha","Gharti");
        daughter.career();
        daughter.hobby();
    }
}

interface program{
    void add();
    void subtract();
}
class Java implements program{
    @Override
   public void add(){

        System.out.println("Adding");

    }

    @Override
    public void subtract() {
        System.out.println("Substracting");
    }
}
class Test{

public static void main(String[] args) {

    Java java = new Java();
    java.add();
    java.subtract();

}
}