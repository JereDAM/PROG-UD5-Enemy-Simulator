package com.mojang.mob.hostilemob;

import com.mojang.interfaces.Combat;
import com.mojang.mob.Mob;

public abstract class HostileMob extends Mob implements Combat{
    
    protected int mobStrength;
    
    public HostileMob(int mobHealth, int mobStrength) {
        super(mobHealth);
        this.mobStrength = mobStrength;
    }

    
    @Override
    public int attack(){
        return this.mobStrength;
    }

    @Override
    public void getAttack(int attack){
        this.mobHealth = this.mobHealth - attack;
        System.out.println("Salud restante del mob: " + this.mobHealth);
    }
}
