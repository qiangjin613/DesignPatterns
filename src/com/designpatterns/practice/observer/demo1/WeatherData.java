package com.designpatterns.practice.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题实体
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 通知所有订阅者
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public String getTemperature() {
        return "18℃";
    }
    public String getHumidity() {
        return "60%";
    }
    public String getPressure() {
        return "200Pa";
    }
}
