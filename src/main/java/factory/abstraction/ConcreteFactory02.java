package factory.abstraction;

/**
 * @author Tian Changqing
 * @date 2022/11/9 10:48
 * @desc
 */
public class ConcreteFactory02 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA02();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB02();
    }
}
