package com.jeffrey.pattern.decorate.weapon;

/**
 * Created by wei on 15/5/2.
 */
public abstract class WeaponEnhance implements Weapon{
    protected Weapon weapon;

    public WeaponEnhance(Weapon weapon) {
        this.weapon = weapon;
    }





}
