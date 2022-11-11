package mediator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 10:06
 * @desc
 */
public class Calender extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender() {
        System.out.println("doCalender()");
    }
}
