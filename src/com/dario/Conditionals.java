package com.dario;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("Eligible to vote!!");
        else
            System.out.println("Not eligible to vote");

    }
}
