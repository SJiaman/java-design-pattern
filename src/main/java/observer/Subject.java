package observer;

/**
 * @author Tian Changqing
 * @date 2022/11/11 15:36
 * @desc
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
