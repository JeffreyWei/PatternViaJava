package com.jeffrey.pattern.command;

/**
 * Created by wei on 15/5/4.
 */
public class HumanSleepCommand  extends  HumanCommand {
    public HumanSleepCommand(Human human) {
        super(human);
    }

    @Override
    public void execute() {
        this.human.sleep();

    }
}
