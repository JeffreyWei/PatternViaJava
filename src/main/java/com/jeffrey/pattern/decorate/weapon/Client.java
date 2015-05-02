package com.jeffrey.pattern.decorate.weapon;

/**
 * Created by wei on 15/5/2.
 */
public class Client {
    public static void main(String [] args) {
        Tank tank=new Tank();
        Cannon cannon=new Cannon(tank);
        Missile missile=new Missile(cannon);
        System.out.println(missile.fire());
    }
}
