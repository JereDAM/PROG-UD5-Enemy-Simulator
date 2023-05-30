package com.mojang.mob.hostilemob;

public class Zombie extends HostileMob{

    public Zombie(int mobHealth, int mobStrength) {
        super(mobHealth = 10);
        this.mobStrength = 4;
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
        System.out.println("Se acercó!");
    }
}
