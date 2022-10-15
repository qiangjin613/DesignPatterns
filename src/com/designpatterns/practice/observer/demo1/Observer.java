package com.designpatterns.practice.observer.demo1;

/**
 * 订阅者
 */
public interface Observer {

    /**
     * 更新天气信息
     *
     * @param temp      天气
     * @param humidity  湿度
     * @param pressure  气压
     */
    void update(float temp, float humidity, float pressure);
}
