package com.javabase;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Name: "+name);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Age: "+ age);
        System.out.print("Enter your favorite programming lang: ");
        String lang = sc.next();
        System.out.println("Tech Stack: "+ lang);
    }
}
