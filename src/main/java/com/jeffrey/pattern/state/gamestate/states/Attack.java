package com.jeffrey.pattern.state.gamestate.states;

import com.jeffrey.pattern.state.gamestate.*;

/**
 * Created by wei on 15/5/5.
 */
public class Attack extends CharacterState {
    @Override
    public CharacterState handle(com.jeffrey.pattern.state.gamestate.Character character) {
        //模拟敌方攻击
        character.setMP(character.getMP() - Untils.getRandom());
        if (character.getMP() >= 100) {
            //使用魔法
            if (Untils.getRandom() >= 5) {
                return character.setState(new MagicWithWater());
            } else {
                return character.setState(new MagicWithWater());
            }
        }
        //普通物理攻击
        return character.setState(new Physical());
    }
}
