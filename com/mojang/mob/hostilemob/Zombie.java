package com.mojang.mob.hostilemob;

public class Zombie extends HostileMob{

    public Zombie(int mobHealth, int mobStrength) {
        super(mobHealth, mobStrength);
    }

    public int getHealth(){
        return this.mobHealth;
    }
    
    @Override
    public void move() {
        System.out.println("Se acercó!");
    }

    @Override
    public void getAttack(int attack){
        int currentHealth;
        attack = attack();
        currentHealth = this.mobHealth - attack;
        System.out.println("Salud restante del mob: " + currentHealth);
    }
}
