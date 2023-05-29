package com.mojang.mob;

public abstract class Mob {
    protected int mobHealth;

    public Mob(int mobHealth){
        this.mobHealth = mobHealth;
    }

    public abstract void move();
}
