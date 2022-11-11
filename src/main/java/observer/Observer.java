package observer;

/**
 * @author Tian Changqing
 * @date 2022/11/11 15:36
 * @desc
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
