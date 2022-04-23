package com.sebastian;

public class Zadanie4 {
    public static void main(String[] args) {

        int user = 100;

        for (int i = 1 ; i <= user ; i++ ) {
            if((i%3 == 0) && (i%7 != 0)){
                System.out.println(i + "Pif 3");

            }
            if ((i%7 == 0) && (i%3 != 0)){
                System.out.println(i +"Paf 7 ");

            }
            if ((i%3 == 0) && (i%7 == 0)){
                System.out.println(i +"Pif Paf 3&7");

            }
            if ((i%3 != 0) && (i%7 != 0)){
                System.out.println(i);

            }

        }

    }
}
