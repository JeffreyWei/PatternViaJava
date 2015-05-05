package com.jeffrey.pattern.state.gamestate;

/**
 * Created by wei on 15/5/5.
 */
public abstract class CharacterState {
    //protected Character character;
    public abstract CharacterState handle(Character character);

//    public Character getCharacter() {
//        return character;
//    }
//
//    public void setCharacter(Character character) {
//        this.character = character;
//    }
}
