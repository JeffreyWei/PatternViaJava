package com.jeffrey.pattern.adapter;

/**
 * @author weij
 */
public class Client {
    public static void main(String[] args) {
        Wolf wolf = new Huitailang();
        Sheep sheep = new SheepAdapter(wolf);
        sheep.eat();
    }
}
