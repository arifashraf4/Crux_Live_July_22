package Lec33;

public class Student {

    String name = "ARif";
    int age = 22;
    static int countOfStudents;
    public void intro_yourSelf() {

        System.out.println("My Name is " + name + " and age is " + age);

    }

    public void sayHi(String name) {
        System.out.println(name + " say hi to " + this.name);
    }

    public static void fun(){

    }

    static {
        System.out.println("Hey all welcome to coding blocks");
    }
}
