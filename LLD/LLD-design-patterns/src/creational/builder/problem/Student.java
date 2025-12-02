package creational.builder.problem;

// PROBLEM CODE — Without Builder Pattern
// Telescoping Constructor Issue

import java.util.List;

public class Student {

    // mandatory fields
    int rollNumber;
    int age;
    String name;
    String branch;

    // optional fields
    String fatherName;
    String motherName;
    List<String> subjects;
    String mobileNo;
    String emailId;

    // Minimal constructor (only mandatory)
    public Student(int rollNumber, int age, String name, String branch) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
    }

    // Overloaded constructor adding fatherName(Optional)
    public Student(int rollNumber, int age, String name, String branch,
                   String fatherName) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
    }

    // Overloaded constructor adding motherName(Optional)
    public Student(int rollNumber, int age, String name, String branch,
                   String fatherName, String motherName) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    // Overloaded constructor adding emailId(Optional)
    // ⚠ Problem: Same signature issue if last two params are same type
    public Student(int rollNumber, int age, String name, String branch,
                   String fatherName, String motherName, String emailId) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.emailId = emailId;
    }

    // Telescoping constructor with all parameters
    public Student(int rollNumber, int age, String name, String branch,
                   String fatherName, String motherName,
                   List<String> subjects, String mobileNo, String emailId) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.subjects = subjects;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }

    public void printDetails() {
        System.out.println("=== Student Details ===");
        System.out.println("Roll No: " + rollNumber
                + ", Name: " + name
                + ", Age: " + age
                + ", Branch: " + branch
                + ", Father: " + fatherName
                + ", Mother: " + motherName
                + ", Subjects: " + subjects
                + ", Mobile: " + mobileNo
                + ", Email: " + emailId);
    }
}

/*
* ❌ Problems:

Too many constructors

Hard to know which argument is what

Constructor signatures clash

Passing null for optional values

Not maintainable

Violates SRP
* */

