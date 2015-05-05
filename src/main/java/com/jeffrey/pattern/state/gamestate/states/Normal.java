package com.jeffrey.pattern.state.gamestate.states;

import com.jeffrey.pattern.state.gamestate.*;
import com.jeffrey.pattern.state.gamestate.Character;

/**
 * Created by wei on 15/5/5.
 */
public class Normal extends CharacterState {


    /**
     * 常规状态->1.防御  2.攻击
     *
     * @param character
     * @return
     */
    @Override
    public CharacterState handle(com.jeffrey.pattern.state.gamestate.Character character) {
        //模拟敌方攻击
        int hurt=Untils.getRandom();
        System.out.println("Thor get "+hurt+" hurt.");
        character.setHP(character.getHP() - hurt);
        if (character.getHP() <= 0) {
            return character.setState(new Dead());
        }
        if (character.getHP() >= 10) {
            //进攻
            return character.setState(new Attack());
        }
        //防守
        return character.setState(new Defense());
    }
}
