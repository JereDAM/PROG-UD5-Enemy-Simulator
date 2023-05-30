package com.mojang.mob.hostilemob;

public class Zombie extends HostileMob{

    public Zombie(int mobHealth, int mobStrength) {
        super(mobHealth, mobStrength);
    }
    
    @Override
    public void move() {
        System.out.println("Se acercó!");
    }
}
