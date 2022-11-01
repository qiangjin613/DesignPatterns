package com.designpatterns.practice.adapter.demo1.impl;

import com.designpatterns.practice.adapter.demo1.Turkey;

/**
 * 一只火鸡
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("火鸡火鸡呼呼呼~");
    }

    @Override
    public void fly() {
        System.out.println("火鸡，短飞！");
    }
}
