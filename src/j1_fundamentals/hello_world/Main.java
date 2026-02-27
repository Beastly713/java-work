package j1_fundamentals.hello_world;

import j1_fundamentals.classes_objects.j1_fields.Student;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.age = 20;
        s1.name = "Alice";

        s2.age = 22;
        s2.name = "Bob";

        System.out.println(s1.name + " is " + s1.age);
        System.out.println(s2.name + " is " + s2.age);
    }
}