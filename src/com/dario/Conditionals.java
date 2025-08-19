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

        sc.nextLine();
        int countWords = 0;
        System.out.printf("Enter words: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                countWords++;
        }
        System.out.println("The number of words: "+(countWords+1));
    }
}
