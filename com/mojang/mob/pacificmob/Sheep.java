package com.mojang.mob.pacificmob;

public class Sheep extends PacificMob{

    public Sheep(int mobHealth) {
        super(mobHealth = 5);
    }

    @Override
    public void move() {
        System.out.println("AYUDAAAAAA *SOLLOZA* LLAMEN A LA POLICIAAA ME ESTÁN MATANDOOOOO *LLORA*");
    }

    public int getHealth(){
        return this.mobHealth;
    }
}
