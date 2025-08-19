package com.dario;

import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {
        String name1 = "Dario";
        String name2 = "George";
        String fullName = name1 + " " + name2;
        System.out.println(fullName.replace("ario", "ariyo"));
        System.out.println(fullName);
    }
}
