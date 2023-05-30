package com.mojang.mob.hostilemob;

public class Enderman extends HostileMob{

    public Enderman(int mobHealth) {
        super(mobHealth = 14);
        this.mobStrength = 6;
    }
    
    public void setHealth(int mobHealth){
        this.mobHealth = mobHealth;
    }

    public int getHealth(){
        return this.mobHealth;
    }

    public void mobStrength(int mobStrength){
        this.mobStrength = mobStrength;
    }

    public int getmobStrength(){
        return this.mobStrength;
    }

    @Override
    public void move() {
        System.out.println("Se teletransportó detrás tuya!");
    }
    
}
