package org.fundamentals.classes;
public class Student {

    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Constructor 1
    public Student(String firstName, String lastName, int registration) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = 0; // Calificación por defecto
        this.year = 1;  // Año por defecto
    }

    // Constructor 2
    public Student(String firstName, String lastName, int registration, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = 1; // Año por defecto
    }

    // Constructor 3
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            year =1;
            System.out.println("Congratulations!");
        }
        return 0;
    }
}