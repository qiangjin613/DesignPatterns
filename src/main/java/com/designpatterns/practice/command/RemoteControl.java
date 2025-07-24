package com.designpatterns.practice.command;

import com.designpatterns.practice.command.impl.NoCommand;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public void printDesc() {
        System.out.println("\n------------- Remote Control ----------------");
        for (int i = 0; i < onCommands.length; i++) {
            System.out.println("[slot " + i + "]" + onCommands[i].getClass().getName() + "\t" + offCommands[i].getClass().getName());
        }
    }
}
