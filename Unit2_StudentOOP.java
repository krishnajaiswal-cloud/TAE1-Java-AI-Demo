/*
 AI-generated base code using GitHub Copilot
 Manually modified, improved, and tested by Krishna Jaiswal
*/
// Create a Java application that models a Student using classes and objects
// Include constructors, methods, and display student details
class Student {
    private String studentname;
    private int age;
    private String studentId;

    // Constructor
    public Student(String studentname, int age, String studentId) {
        this.studentname = studentname;
        this.age = age;
        this.studentId = studentId;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + studentname);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}

public class Unit2_StudentOOP {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "S001");
        Student s2 = new Student("Bob", 22, "S002");

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}