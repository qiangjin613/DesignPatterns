package com.designpatterns.practice.command.impl;

import com.designpatterns.practice.command.CeilingFan;
import com.designpatterns.practice.command.Command;

public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {

    }
}
