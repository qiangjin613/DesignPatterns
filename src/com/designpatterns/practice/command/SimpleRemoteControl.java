package com.designpatterns.practice.command;

/**
 * 一个简单的遥控器 - 命令调用类
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command slot) {
        this.slot = slot;
    }
    public void buttonWasPressed() {
        slot.execute();
    }
}
