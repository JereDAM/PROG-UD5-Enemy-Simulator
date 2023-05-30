package com.mojang.mob.pacificmob;

import com.mojang.interfaces.Damage;
import com.mojang.mob.Mob;

public abstract class PacificMob extends Mob implements Damage{

    public PacificMob(int mobHealth) {
        super(mobHealth);
    }
    
    @Override
    public void getAttack(int attack){
        int currentHealth = this.mobHealth - attack;
        System.out.println("Salud restante del mob: " + currentHealth);
    }

}
