package com.designpatterns.practice.observer.demo1;

/**
 * 发布者、主题
 */
public interface Subject {

    /**
     * 订阅主题
     */
    void registerObserver(Observer observer);

    /**
     * 退订主题
     */
    void removeObserver(Observer observer);

    /**
     * 通知主题
     */
    void notifyObserver();
}
