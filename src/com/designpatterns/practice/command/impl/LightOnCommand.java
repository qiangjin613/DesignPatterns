package com.designpatterns.practice.command.impl;

import com.designpatterns.practice.command.Command;
import com.designpatterns.practice.command.Light;

/**
 * 开灯的命令
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
