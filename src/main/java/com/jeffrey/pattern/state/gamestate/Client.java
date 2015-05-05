package com.jeffrey.pattern.state.gamestate;

import com.jeffrey.pattern.state.gamestate.states.Dead;
import com.jeffrey.pattern.state.gamestate.states.Normal;

/**
 * Created by wei on 15/5/5.
 */
public class Client {
    public static void main(String[] args) {
        Character thor = new Character("Thor", 100, 200);
        System.out.println("=======auto fight========");
        thor.setState(new Normal());
        boolean guard = true;
        do {
            if (Dead.class.isInstance(thor.startFight())) {
                guard = false;
            }
        }
        while (guard);
        System.out.println("=======fight  end========");
    }
}
