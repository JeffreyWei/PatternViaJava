package com.jeffrey.pattern.state.gamestate;

/**
 * Created by wei on 15/5/5.
 */
public class Character {
    private int HP;
    private int MP;
    private String name;
    private CharacterState state;

    public Character(String name, int HP, int MP) {
        this.HP = HP;
        this.MP = MP;
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterState getState() {
        return state;
    }

    public CharacterState setState(CharacterState state) {
        this.state = state;
        System.out.println("战斗报告--HP:" + this.HP + " MP:" + this.MP + " State:" + state.getClass().getName());
        return state;
    }

    public CharacterState startFight() {
        return this.state.handle(this);
    }
}
