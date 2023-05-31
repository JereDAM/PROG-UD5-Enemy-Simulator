package com.mojang.mob.hostilemob;

public class Enderman extends HostileMob{

    public Enderman(int mobHealth, int mobStrength) {
        super(mobHealth, mobStrength);
    }

    public int getHealth(){
        return this.mobHealth;
    }
    
    @Override
    public void move() {
        System.out.println("Se teletransportó detrás tuya!");
    }
    
}
