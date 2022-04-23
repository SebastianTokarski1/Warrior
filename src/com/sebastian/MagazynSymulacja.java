package com.sebastian;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MagazynSymulacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int usun;


        String[] produkt = new String[]{null, null , null};

        System.out.println("\t \t Witamy!!");
        do {
            System.out.println("\tWybierz 1 z opocji: ");
            System.out.println();
            System.out.println("1. Sprawdz zawartosc magazynu\n2. dodaj produkt\n3. usun produkt\n4. Wyjdz ");
            a = scanner.nextInt();

            switch (a) {
                case 1: //zawartosc magazynu
                    System.out.println("Zawartość Magazynu: " + Arrays.toString(produkt) + Array.getLength(produkt));
                    if (produkt[0] == null && produkt[1]==null && produkt[2] == null){
                        System.out.println("\t\tMagazyn jest pusty:");
                    }
                    break;
                case 2: // dodawanie produktu
                    for (int i = 0; i < produkt.length; i++) {
                        if (produkt[i] != null) {
                            System.out.println("Magazyn jest pelen!! Usun produkt: ");
                            System.out.println("Stan magazynu: \n" + Arrays.toString(produkt));
                            System.out.println();

                        }
                        if (produkt[i] == null) {
                            System.out.println("dodaj produkt. Wpisz nazwe: ");
                            String newProdukt = scanner.next();
                            produkt[i] = newProdukt;
                            System.out.println("Produkt zostal dodany: " + newProdukt);
                            System.out.println("Stan magazynu: \n" + Arrays.toString(produkt));
                            System.out.println();
                            break;
                        }


                    }
                    break;
                case 3:
                    do {//usuwanie produktu
                        System.out.println("Ktory produkt chcesz usunac?");
                        System.out.println("1 " + produkt[0]);
                        System.out.println("2 " + produkt[1]);
                        System.out.println("3 " + produkt[2]);
                        System.out.println("4 Wróć: ");
                        usun = scanner.nextInt();
                        switch (usun) {
                            case 1:
                                if (produkt[0] == null) {
                                    System.out.println("Pole jest puste. Wybierz inne:");
                                }
                                if (produkt[0] != null) {
                                    produkt[0] = null;
                                    System.out.println("Usunieto ");
                                }
                                break;
                            case 2:
                                if (produkt[1] == null) {
                                    System.out.println("Pole jest puste. Wybierz inne:");
                                }
                                if (produkt[1] != null) {
                                    produkt[1] = null;
                                    System.out.println("Usunieto ");
                                }
                                break;
                            case 3:
                                if (produkt[2] == null) {
                                    System.out.println("Pole jest puste. Wybierz inne:");
                                }
                                if (produkt[2] != null) {
                                    produkt[2] = null;
                                    System.out.println("Usunieto ");
                                }
                                break;
                            case 4:
                                usun = 0;
                                break;
                            default:
                                System.out.println("Błąd: opcja spoza zakresu. Wybierz ponownie: ");
                                break;
                        }
                    } while (usun > 0);
                    break;
                case 4:
                    a = 0;
                    break;
                default:
                    System.out.println("Błąd: opcja spoza zakresu. Wybierz ponownie: ");
                    break;

            }

        } while (a > 0);
    }


}
