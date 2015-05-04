package com.jeffrey.pattern.command;

/**
 * Created by wei on 15/5/4.
 */
public class HumanWorkCommand extends HumanCommand {
    public HumanWorkCommand(Human human) {
        super(human);
    }

    @Override
    public void execute() {
        this.human.work();
    }
}
