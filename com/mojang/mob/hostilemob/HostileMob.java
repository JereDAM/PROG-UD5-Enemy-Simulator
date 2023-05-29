package com.mojang.mob.hostilemob;

import com.mojang.interfaces.Combat;
import com.mojang.mob.Mob;

public abstract class HostileMob extends Mob implements Combat{
    
    public HostileMob(int mobHealth) {
        super(mobHealth);
    }

    protected int mobStrength;
    
    @Override
    public int attack(){
        return this.mobStrength;
    }

    @Override
    public void getAttack(int attack){
        attack = attack();
        int currentHealth = this.mobHealth - attack;
        System.out.println("Salud restante: " + currentHealth);
    }
}