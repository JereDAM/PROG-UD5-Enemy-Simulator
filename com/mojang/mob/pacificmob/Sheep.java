package com.mojang.mob.pacificmob;

public class Sheep extends PacificMob{

    public Sheep(int mobHealth) {
        super(mobHealth = 5);
    }
    
    public void setHealth(int mobHealth){
        this.mobHealth = mobHealth;
    }
    
    public int getHealth(){
        return this.mobHealth;
    }


    @Override
    public void move() {
        System.out.println("AYUDAAAAAA *SOLLOZA* LLAMEN A LA POLICIAAA ME ESTÁN MATANDOOOOO *LLORA*");
    }
}
