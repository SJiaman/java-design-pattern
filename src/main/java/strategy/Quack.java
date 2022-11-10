package strategy;

/**
 * @author Tian Changqing
 * @date 2022/11/10 9:31
 * @desc
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack!");
    }
}
