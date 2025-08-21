package com.javabase;

public class Casting {
    public static void main(String[] args) {
        double num = 100.0;
        num+= (int)9.9;
        int intNum = (int)num; //Type Casting
        System.out.println("Int:" + intNum);
        System.out.println("Double: " + num);

        //Constants

        final float PI = 3.14F;
        System.out.println("PI:"+PI);
    }
}
