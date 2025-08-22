package com.javabase;

class Fibbo{
    static int printFibbo(int count, int n1, int n2){
        if (count==0){
            return 0;
        }
        else{
            System.out.println(n1+ "  ");
            printFibbo(count -1, n2, n2+n1);
            return 0;
        }
    }
}

public class Fibbonacci {
    public static void main(String[] args) {
        Fibbo f = new Fibbo();
        f.printFibbo(4,0,1);
    }
}
