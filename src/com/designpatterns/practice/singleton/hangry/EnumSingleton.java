package com.designpatterns.practice.singleton.hangry;

/**
 * 饿汉式 - 使用枚举实现单例
 */
public enum EnumSingleton {

    EnumSingleton
}

class UseEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.EnumSingleton;
        // do sth.
    }
}
