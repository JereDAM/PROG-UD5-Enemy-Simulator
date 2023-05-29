package com.mojang.mob.hostilemob;

public class Enderman extends HostileMob{

    public Enderman(int mobHealth, int mobStrength) {
        super(mobHealth = 14);
        this.mobStrength = 6;
    }

    @Override
    public void move() {
        System.out.println("Se teletransportó detrás tuya!");
    }
    
}
