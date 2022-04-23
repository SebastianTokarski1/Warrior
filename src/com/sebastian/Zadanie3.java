package com.sebastian;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        double delta = 0;

        do {


            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();


            delta = calculateDelta(a, b, c);
            double x1 = calculateX1(a, b, delta);
            double x2 = calculateX2(a, b, delta);

            double result = a * Math.pow(x2, 2) + b * x1 + c;


            if (delta < 0) {
                System.out.println(delta);

            }if (delta >= 0){
                System.out.println("Delta is: " + delta);
                System.out.println("result is : " + result);
            }

        } while (delta >= 0);
    }

    public static double calculateX1(int a, int b, double delta) {
        double x1 = ((-b) - Math.pow(delta, 0.5)) / (2 * a);
        return x1;
    }

    public static double calculateX2(int a, int b, double delta) {
        double x2 = ((-b) + Math.pow(delta, 0.5)) / (2 * a);
        return x2;
    }

    public static double calculateDelta(int a, int b, int c) {
        double delta = (Math.pow(b, 2)) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Delta ujemna :");
        }
        return delta;
    }

}
