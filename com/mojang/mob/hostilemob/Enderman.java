package com.mojang.mob.hostilemob;

public class Enderman extends HostileMob{

    public Enderman(int mobHealth) {
        super(mobHealth = 14);
        this.mobStrength = 6;
    }

    @Override
    public void move() {
        System.out.println("Se teletransportó detrás tuya!");
    }
    
    public int getHealth(){
        return this.mobHealth;
    }

    public int getmobStrength(){
        return this.mobStrength;
    }
}
