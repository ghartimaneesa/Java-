package Student;

public class Student {

    private String firstName;

    private String lastName;

    private int age;

    private static String schoolName;

    private static int counter;

    private  boolean result;


    static {
        schoolName = "UIA";
        counter = 0;
    }

    Student(){
        firstName = "Manisha";
        lastName = "Gharti";
        age = 23;
        schoolName = "UIA";

    }

    {
        counter ++;
    }

    Student(String firstName, String lastName,String schoolName, int age, boolean result){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.result = result;
        this.schoolName = schoolName;

    }





    void showDetails(){

        System.out.println("Firstname of the student is" + firstName);
        System.out.println("Lastname of the student is" + lastName);
        System.out.println("School of the student is" + schoolName);
        System.out.println("Age of the student is" + age);
        System.out.println("Result of the student is" + result);

    }

    static void countStudent(){

        System.out.println("Total no of the the school is " + counter);

    }

    void changeResult(){

        if(result == true)
            result = false;
        else
            result = true;

    }

    void changeSchoolName(String school_Name){
        this.schoolName = school_Name;
    }
}
