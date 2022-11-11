package mediator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 10:03
 * @desc
 */
public class CoffeePot extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }

}
