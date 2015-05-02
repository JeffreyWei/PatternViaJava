package com.jeffrey.pattern.decorate.weapon;

/**
 * Created by wei on 15/5/2.
 */
public class Cannon extends WeaponEnhance {
    public Cannon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String fire() {
        return this.weapon.fire() + " with Cannon";
    }
}
