package com.sebastian;

public class Warrior {
    private String name;
    private int strenght;
    private int health;
    private int luck;

    @Override
    public String toString() {
        return
                name +
                ": strenght==> " + strenght +
                ": health==> " + health +
                ": luck==> " + luck;
    }

    public Warrior (String name, int strenght , int health , int luck){
        this.name = name;
        this.strenght = strenght;
        this.health = health;
        this.luck = luck;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }
    public void blabla (){

    }
}
