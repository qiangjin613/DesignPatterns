package com.designpatterns.practice.singleton;

public class JingdianSingleton {

    private static JingdianSingleton singleton;

    private JingdianSingleton() {}

    public static JingdianSingleton getInstance() {
        if (singleton == null) {
            singleton = new JingdianSingleton();
        }
        return singleton;
    }
}


class Test {

    public static void main(String[] args) {
        JingdianSingleton jingdianSingleton = JingdianSingleton.getInstance();
    }
}
