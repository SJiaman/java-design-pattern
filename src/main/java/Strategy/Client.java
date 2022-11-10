package Strategy;

/**
 * @author Tian Changqing
 * @date 2022/11/10 9:34
 * @desc 策略模式
 * 定义一系列算法，封装每个算法，并使它们可以互换。
 *
 * 策略模式可以让算法独立于使用它的客户端
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Quack());
        duck.say();
        duck.setQuackBehavior(new Squeak());
        duck.say();
    }
}
