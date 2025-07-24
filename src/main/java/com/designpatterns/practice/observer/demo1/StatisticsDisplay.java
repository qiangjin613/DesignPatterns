package com.designpatterns.practice.observer.demo1;

/**
 * 订阅者实体：展示气温的统计值
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float maxTemperature;
    private float temperatureSum;
    private int temperatureCount;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (temperature != 0) {
            this.temperature = temperature;
            this.temperatureSum += temperature;
            this.temperatureCount++;
            if (this.maxTemperature < temperature) {
                this.maxTemperature = temperature;
            }
        }
        display();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName() + " 更新了，最新 Temperature 统计结果：");
        System.out.println("Current" + "\t" + "Avg" + "\t" + "Max");
        System.out.println(temperature + "\t" + (temperatureSum / temperatureCount) + "\t" + maxTemperature);
    }
}
