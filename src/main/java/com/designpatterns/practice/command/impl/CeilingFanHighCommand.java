package com.designpatterns.practice.command.impl;

import com.designpatterns.practice.command.CeilingFan;
import com.designpatterns.practice.command.Command;

/**
 * 打开风扇的命令
 */
public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
        System.out.println("风扇挡位：" + ceilingFan.getSpeed());
    }

    @Override
    public void undo() {

    }
}
