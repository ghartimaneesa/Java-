package Student;

public class Main {

    public static void main(String[] args) {

        Student.countStudent();

        Student s1 = new Student();
        System.out.println("****Details of the student 1");
                s1.showDetails();


        Student s2 = new Student();
        System.out.println("****Details of the student 2");
        s2.showDetails();


        Student s3 = new Student();
        System.out.println("****Details of the student 3");
        s3.showDetails();



        Student s4 = new Student("anisha","lama","uia",90, false);
        s4.showDetails();

        Student.countStudent();

        s4.changeResult();
        s4.showDetails();
        Student.countStudent();

        s4.changeSchoolName("Unique English Boarding School");
        s4.showDetails();


    }
}
