package com.jeffrey.pattern.state.gamestate;

import com.jeffrey.pattern.state.gamestate.states.Dead;
import com.jeffrey.pattern.state.gamestate.states.Normal;

/** 命令模式
 * 允许对象在内部状态改变时改变它的行为，
 * 对象看起来好像修改了它的类。
 * Created by wei on 15/5/5.
 */
public class Client {
    public static void main(String[] args) {
        Character thor = new Character("Thor", 100, 200);
        System.out.println("=======auto fight========");
        thor.setState(new Normal());
        do {
            if (Dead.class.isInstance(thor.startFight())) {
                break;
            }
        }
        while (true);
        System.out.println("=======fight  end========");
    }
}
