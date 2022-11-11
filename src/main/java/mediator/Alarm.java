package mediator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 10:02
 * @desc
 */
public class Alarm extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm() {
        System.out.println("doAlarm()");
    }
}
