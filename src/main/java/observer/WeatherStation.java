package observer;

/**
 * @author Tian Changqing
 * @date 2022/11/11 15:39
 * @desc 观察者模式
 * 定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
 *
 * 主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者
 *
 * 主题（Subject）具有注册和移除观察者、并通知所有观察者的功能，主题是通过维护一张观察者列表来实现这些操作的。
 *
 * 观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法。
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        DayDisplay dayDisplay = new DayDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(1, 1, 1);
    }
}
