package observer;

/**
 * @author Tian Changqing
 * @date 2022/11/11 15:48
 * @desc
 */
public class DayDisplay implements Observer{
    public DayDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("DayDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
