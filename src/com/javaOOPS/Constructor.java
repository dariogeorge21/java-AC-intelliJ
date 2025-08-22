package com.javaOOPS;

class Hostel{
    int roomNumber;
    String department;
    void printInfo(){
        System.out.println("Room Number: "+roomNumber+" Department: "+department);
    }
}

class Animal{
    String name;
    int code;
    Animal(String n, int c){
        name = n;
        code = c;
    }
    void printInfo(){
        System.out.println("Animal Name: "+name+" With code: "+code);
    }
}
public class Constructor {
    public static void main(String[] args) {
       Hostel h1 = new Hostel();//non-parameterized constructor
       h1.roomNumber = 326;
       h1.department = "CSE";
       h1.printInfo();

       Animal a1 = new Animal("Eldhose",39);
       a1.printInfo();
    }
}
