package factory.abstraction;

/**
 * @author Tian Changqing
 * @date 2022/11/9 10:49
 * @desc 抽象工厂， 创建一个产品族
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory concreteFactory01 = new ConcreteFactory01();
        ProductA productA = concreteFactory01.createProductA();
        ProductB productB = concreteFactory01.createProductB();
    }
}
