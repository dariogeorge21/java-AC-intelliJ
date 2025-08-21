package com.javabase;

public class Strings {
    public static void main(String[] args) {
        String name1 = "Dario";
        String name2 = "George";
        String fullName = name1 + " " + name2;
        System.out.println(fullName.substring(0, 4));
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.replace("rio","riyo"));
    }
}
