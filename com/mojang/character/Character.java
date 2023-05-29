package com.mojang.character;

import com.mojang.interfaces.Combat;

public class Character implements Combat{
    private int health;
    private int defense;
    private int strength;

    public Character(int defense, int strength){
        this.defense = defense;
        this.strength = strength;
        this.health = 12; 
    }

    @Override
    public int attack(){
        return this.strength;
    }

    @Override
    public void getAttack(int attack){
        attack = attack() - this.defense;
        int currentHealth = this.health - attack;
        System.out.println("Daño recibido: " + attack);
        System.out.println("Salud restante: " + currentHealth);
    }

}
