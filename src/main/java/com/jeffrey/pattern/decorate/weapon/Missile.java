package com.jeffrey.pattern.decorate.weapon;

/**
 * Created by wei on 15/5/2.
 */
public class Missile extends WeaponEnhance {
    public Missile(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String fire() {
        return this.weapon.fire() + " with Missile";
    }
}
