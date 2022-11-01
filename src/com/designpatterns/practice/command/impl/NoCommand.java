package com.designpatterns.practice.command.impl;

import com.designpatterns.practice.command.Command;

/**
 * 这个命令什么也不做，仅仅是为了避免在 execute() 中对 NULL 对象进行判断
 */
public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
