package com.designpatterns.practice.command;

import com.designpatterns.practice.command.impl.CeilingFanHighCommand;
import com.designpatterns.practice.command.impl.LightOnCommand;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        lightOnCommand.execute();
        // 开灯
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
        // 风扇调到高档
        remoteControl.setCommand(new CeilingFanHighCommand(new CeilingFan("客厅")));
        remoteControl.buttonWasPressed();
    }
}
