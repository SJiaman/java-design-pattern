package Strategy;

/**
 * @author Tian Changqing
 * @date 2022/11/10 9:32
 * @desc
 */
public class Duck {
    private QuackBehavior quackBehavior;

    public void say() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
