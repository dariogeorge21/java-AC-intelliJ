package com.javaOOPS;

class Student{
    String Name;
    int age;

    void printDetails(){
        System.out.println("Hello "+Name);
    }
}
public class classes {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Dario";
        s1.age = 18;
        s1.printDetails();
    }
}
