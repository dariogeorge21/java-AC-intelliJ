package com.javaOOPS;

class pen{
    String company;
    String type;

    void printDetails(){
        System.out.println("The "+this.type+" is from "+this.company);
    }
}
// This keyword acts as reference to the current object. It helps to differentiate between the local and instance variables.
public class This {
    public static void main(String[] args) {
        pen p1 = new pen();
        pen p2 = new pen();
        p1.company = "Flair";
        p1.type  = "Ballpoint";
        p1.printDetails();
        p2.company = "Lexi";
        p2.type  = "Pinpoint";
        p2.printDetails();
    }
}
