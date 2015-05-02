package com.jeffrey.pattern.decorate.weapon;

/**
 * Created by wei on 15/5/2.
 */
public class Tank implements Weapon {
    @Override
    public String fire() {
        return "this is Tank fire";
    }
}
