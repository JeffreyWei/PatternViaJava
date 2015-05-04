package com.jeffrey.pattern.command;

/**
 * Created by wei on 15/5/4.
 */
public abstract class HumanCommand implements Command {
protected Human human;

    public HumanCommand(Human human) {
        this.human = human;
    }

    public abstract void execute();
}
