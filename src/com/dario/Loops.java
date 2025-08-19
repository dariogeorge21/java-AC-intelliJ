package com.dario;

public class Loops {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }

        //while loop
        int i = 0;
        while (i<10){
            System.out.println(i+1);
            i++;
        }

        //do while loop
        int j = 10;
        do {
            System.out.println(j);
            j--;
        } while (j>0);
    }
}
