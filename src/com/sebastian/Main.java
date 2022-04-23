package com.sebastian;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Warrior> warrior;
        warrior = new ArrayList<>();
        warrior.add(new Warrior("JOCKER", 10, 200, 55));
        warrior.add(new Warrior("BATMAN", 20, 200, 45));
        warrior.add(new Warrior("PRINCE", 10, 300, 40));
        warrior.add(new Warrior("HULK", 25, 360, 1));
        warrior.add(new Warrior("SPIDERMAN", 15, 200, 40));
        warrior.add(new Warrior("SPAWN", 20, 300, 35));
        warrior.add(new Warrior("MAGNETO", 5, 200, 70));
        warrior.add(new Warrior("AQUAMAN", 10, 240, 45));
        warrior.add(new Warrior("THOR", 15, 380, 40));
        warrior.add(new Warrior("LOSIEK", 15, 300, 45));

        System.out.println("Lista zawodnikow: " + warrior);

        int randomNumber1 = random.nextInt(warrior.size());
        int randomNumber2 = random.nextInt(warrior.size());


        while (randomNumber1 == randomNumber2) {


            randomNumber1 = random.nextInt(warrior.size());
            randomNumber2 = random.nextInt(warrior.size());

        }


        Warrior warrior1 = warrior.get(3);
        Warrior warrior2 = warrior.get(randomNumber2);

        System.out.println("\t  " + randomNumber1 + " - Wylosowano zawdnika: " + warrior1.getName());
        System.out.println("\t  " + randomNumber2 + " - Wylosowano zawodnika: " + warrior2.getName());
        System.out.println(" ");
        System.out.println("                 START     FIGHT!!!!!!                         ");

        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("");
        System.out.println("");
        System.out.println("|| || || || || || || || || || || || || || || || ||");

        fight(warrior1, warrior2);


    }



    public static void fight(Warrior warrior1, Warrior warrior2) {
        Random random = new Random();
        int runda = 1;

        while ((warrior1.getHealth() >= 0) && (warrior2.getHealth() >= 0)) {

            int r2 = random.nextInt(warrior2.getLuck());
            int r1 = random.nextInt(warrior1.getLuck());
            runda += 1;
            System.out.println("=================================================");
            System.out.println("                    RUNDA =>" + runda);
            System.out.println(warrior1 + " [" + r1 + "+" + warrior1.getStrenght() + "= " + (r1 + warrior1.getStrenght()) + "]");
            System.out.println(warrior2 + " [" + r2 + "+" + warrior2.getStrenght() + "= " + (r2 + warrior2.getStrenght()) + "]");
            System.out.println(" ");

            warrior1.setHealth(warrior1.getHealth() - (warrior2.getStrenght() + r2));
            warrior2.setHealth(warrior2.getHealth() - (warrior1.getStrenght() + r1));
            if (warrior1.getHealth() <= 0) {
                System.out.println("\t " + warrior1.getName() + "  Pokonany przez: " + warrior2.getName());
                break;
            }
            if (warrior2.getHealth() <= 0) {
                System.out.println("\t " + warrior2.getName() + "  Pokonany przez: " + warrior1.getName());
                break;
            }

        }


    }

}
