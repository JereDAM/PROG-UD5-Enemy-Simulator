package com.mojang.character;

public class Character {
    private int health;
    private int defense;
    private int strength;

    public Character(int defense, int strength){
        this.defense = defense;
        this.strength = strength;
        this.health = 12; 
    }

}
