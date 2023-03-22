package Lec33;

public class Student_Client {
    public static void main(String[] args) {

        System.out.println("Hello bye");
        Student s = new Student();
        Student s1 = new Student();
        s.name = "Kaju";
        s.age = 21;
        s1.name = "Katli";
        s1.age = 22;
        s.intro_yourSelf();
        s1.intro_yourSelf();
        s.sayHi("Priya");
        s1.sayHi("Priya");
        int x = Student.countOfStudents;
        Student.fun();


    }

    static {
        System.out.println("Hey all welcome to coding blocks");
    }
}
