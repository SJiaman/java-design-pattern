package bridge;

/**
 * @author Tian Changqing
 * @date 2022/11/18 17:57
 * @desc 桥接器
 *
 * 两种抽象：
 * 两种关系都依赖于抽象，都有不同的实现
 * 将抽象与实现分离开来，使它们可以独立变化
 * 
 */
public class Client {
    public static void main(String[] args) {
        SonyTV sonyTV = new SonyTV();
        ConcreteRemoteControl concreteRemoteControl = new ConcreteRemoteControl(sonyTV);
        concreteRemoteControl.on();
        concreteRemoteControl.tuneChannel();
        concreteRemoteControl.off();
    }
}
