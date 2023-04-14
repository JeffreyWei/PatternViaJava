package com.jeffrey.pattern.state.gamestate.states;

import com.jeffrey.pattern.state.gamestate.*;

/**
 * Created by wei on 15/5/5.
 */
public class MagicWithWater extends CharacterState {
	@Override
	public CharacterState handle(com.jeffrey.pattern.state.gamestate.Character character) {
		return character.setState(new Normal());
	}
}
