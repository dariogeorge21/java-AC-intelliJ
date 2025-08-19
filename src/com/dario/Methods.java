package com.dario;

import java.util.Scanner;

public class Methods {
    public static void AddTwoNumber(int a, int b){
        int sum = a + b;
        System.out.println("Sum: "+sum);
    }
    public static void PrintName(String name){
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        AddTwoNumber(num1,num2);
        sc.nextLine();
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        PrintName(name);
    }
}
