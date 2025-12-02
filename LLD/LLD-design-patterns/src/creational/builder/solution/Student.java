package creational.builder.solution;

import java.util.List;

// Step 1: Product class
public class Student {

    int rollNumber;
    int age;
    String name;
    String branch;

    String fatherName;
    String motherName;
    List<String> subjects;
    String mobileNo;
    String emailId;

    // Constructor gets values from builder
    Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.branch = builder.branch;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.subjects = builder.subjects;
        this.mobileNo = builder.mobileNo;
        this.emailId = builder.emailId;
    }

    @Override
    public String toString() {
        return "roll: " + rollNumber
                + ", age: " + age
                + ", name: " + name
                + ", branch: " + branch
                + ", father: " + fatherName
                + ", mother: " + motherName
                + ", subjects: " + subjects
                + ", mobile: " + mobileNo
                + ", email: " + emailId;
    }
}

