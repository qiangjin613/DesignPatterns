package com.designpatterns.practice.command;

/**
 * 控制灯的类 - 命令请求的接收者
 */
public class Light {

    public void on() {
        System.out.println("开灯");
    }

    public void off() {
        System.out.println("关灯");
    }
}
