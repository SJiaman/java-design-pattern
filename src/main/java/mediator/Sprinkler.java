package mediator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 10:06
 * @desc
 */
public class Sprinkler extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler() {
        System.out.println("doSprinkler()");
    }
}
