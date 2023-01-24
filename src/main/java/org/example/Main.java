package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        int a = random.nextInt(10)+1;
//        int b = random.nextInt(10)+1;
        int a = 2;
        int b = 5;
        abbreviatedMultiplication2(a,b);
        abbreviatedMultiplication3(a,b);
        degree(a,b);

    }

    public static int abbreviatedMultiplication2(int a, int b){
        int c = (a+b)*(a+b);
        System.out.println(c);
        return c;
    }

    public static int abbreviatedMultiplication3(int a, int b){
        int c = (a+b)*(a+b)*(a+b);
        System.out.println(c);
        return c;
    }

    public static int degree (int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        System.out.println(c);

        return c;
    }


}
