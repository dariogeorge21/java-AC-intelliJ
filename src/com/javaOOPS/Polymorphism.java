package com.javaOOPS;


import javax.management.relation.Role;

class Student3 {
    String name;
    int rollNumber;
    String home;

    // Constructor
    Student3(String name, int rollNumber, String home) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.home = home;
    }

    // Overloaded methods
    void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    void printInfo(String name, int rollNumber) {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }

    void printInfo(String name, int rollNumber, String home) {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Home: " + home);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Dario", 32, "Idukki");
        s1.printInfo("Eldose");
        s1.printInfo("Jose",323);
        s1.printInfo("Joe", 44, "Pala");
    }
}
