package com.dario;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Name: "+name);
    }
}
