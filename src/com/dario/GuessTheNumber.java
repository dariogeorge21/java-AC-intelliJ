package com.dario;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int RandomNum = (int)(Math.random()*100);
        while(true){
            System.out.println("Guess the random number that has chosen by the system: ");
            int InputNumber = sc.nextInt();
            if (InputNumber>RandomNum){
                System.out.println("Less than that!!");
            } else if (RandomNum > InputNumber) {
                System.out.println("Greater than that!!");
            } if (RandomNum  == InputNumber) {
                System.out.println("You guessed the number !!");
                break;
            }
        }
    }
}
