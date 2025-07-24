package com.designpatterns.practice.observer.demo1;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherDataSubject = new WeatherData();
        Observer ccdObserver = new CurrentConditionsDisplay(weatherDataSubject);
        Observer sdObserver = new StatisticsDisplay(weatherDataSubject);
        // 主题通知
        weatherDataSubject.measurementsChanged();
        // 更改主题，再次通知
        weatherDataSubject.setMeasurements(11, 12, 13);
        weatherDataSubject.setMeasurements(18, 15, 12);
    }
}
