package com.jeffrey.pattern.adapter;

/**
 * Created by wei on 15/5/4.
 */
public class SheepAdapter implements Sheep {
   private Wolf wolf;

    public SheepAdapter(Wolf wolf) {
        this.wolf = wolf;
    }

    @Override
    public void eat() {
        this.wolf.eatMeat();
    }
}
