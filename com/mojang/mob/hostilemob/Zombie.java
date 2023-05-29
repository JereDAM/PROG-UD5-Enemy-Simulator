package com.mojang.mob.hostilemob;

public class Zombie extends HostileMob{

    public Zombie(int mobHealth, int mobStrength) {
        super(mobHealth = 10);
        this.mobStrength = 4;
    }
    
    @Override
    public void move() {
        System.out.println("Se acercó!");
    }
}
