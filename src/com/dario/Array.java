package com.dario;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 91;
        marks[1] = 92;
        marks[2] = 90;
        //print
        for(int i=0;i<marks.length; i++){
            System.out.println(marks[i]);
        }
        //length
        System.out.println("Length: "+marks.length);
        //Sort
        Arrays.sort(marks);
        System.out.println("Arrays Sorted:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

//        Two Dimensional Arrays
        int[][] mark2 = {{1,1},{2,2},{3,3},{4,4}};
        for (int i = 0; i < mark2.length; i++) {
            for (int j = 0; j < mark2[1].length; j++) {
                System.out.println("Marks: "+mark2[i][j]);
            }
        }
    }
}
