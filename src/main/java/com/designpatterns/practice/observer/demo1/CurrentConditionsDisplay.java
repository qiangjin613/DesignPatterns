package com.designpatterns.practice.observer.demo1;

/**
 * 订阅者实体：展示当前环境
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName() + " 更新了: ");
        System.out.println(temperature + "℃ " + humidity + "湿度");
    }
}
