package factory.abstraction;

/**
 * @author Tian Changqing
 * @date 2022/11/9 10:47
 * @desc
 */
public class ConcreteFactory01 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA01();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB01();
    }
}
