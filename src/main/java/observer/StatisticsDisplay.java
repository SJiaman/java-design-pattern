package observer;

/**
 * @author Tian Changqing
 * @date 2022/11/11 15:38
 * @desc
 */
public class StatisticsDisplay  implements Observer{
    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
