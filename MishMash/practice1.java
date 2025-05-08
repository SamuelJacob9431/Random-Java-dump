// Abstract class
abstract class Person {
    String name;

    Person(String name) {
    this.name = name;
    }

    // Abstract method
    abstract void displayInfo();
}

// Superclass
class Student extends Person {
    final int studentId;

    // Constructor with super
    Student(String name, int studentId) {
        super(name); // using super to call superclass constructor
        this.studentId = studentId;
    }

    // Method Overloading
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
    }

    void displayInfo(String course) {
        System.out.println(name + " is enrolled in " + course);
    }
}

// Subclass
class CollegeStudent extends Student {
    String collegeName;

    CollegeStudent(String name, int studentId, String collegeName) {
        super(name, studentId);
        this.collegeName = collegeName;
    }

    // Override displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("College: " + collegeName);
    }
}

public class practice1 {
    public static void main(String[] args) {
        // Using "new" to create an object
        CollegeStudent student = new CollegeStudent("Aman", 101, "IIT Delhi");

        // Demonstrating Abstract, Final, Super, Inheritance, Overriding
        student.displayInfo();

        // Demonstrating Method Overloading
        student.displayInfo("Computer Science");

        // String and StringBuffer demonstration
        String str = "Hello";
        StringBuffer strBuffer = new StringBuffer(str);

        strBuffer.append(" World!");
        System.out.println("StringBuffer Result: " + strBuffer);
    }
}
