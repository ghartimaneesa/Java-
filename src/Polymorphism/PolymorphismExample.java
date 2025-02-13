package Polymorphism;
/**
 * One entity many forms
 * two methods to get:
 * Method overloading
 * Method Overriding
*/

/**
 * Method overloading is the process where the same method exist in the subclass.
 * it occurs in run time.
 * it depends on the object type(dynamic method dispatch
 * lazy method
 */
public class PolymorphismExample {

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.add();
        shape.add(9,9);
        Circle circle =new Circle();

//        Shape circle1 = new Circle(); circle inherit all the methid that is mentioned in the parent clas
        circle.area();


    }
}

class Shape{

    void add(){
        System.out.println("Adding");
    }
    //Method Overloading
    //Same method but with different paramenter
    void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    void area(){
        System.out.println("Shape are");

    }
}


class Circle extends Shape{
    @Override
    void area(){
        System.out.println("Circle area");
    }
}