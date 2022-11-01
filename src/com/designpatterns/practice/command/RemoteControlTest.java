package com.designpatterns.practice.command;

import com.designpatterns.practice.command.impl.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setCommand(new LightOnCommand(new Light()));
        remoteControl.buttonWasPressed();
    }
}
