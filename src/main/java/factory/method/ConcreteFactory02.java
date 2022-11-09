package factory.method;

/**
 * @author Tian Changqing
 * @date 2022/11/9 10:11
 * @desc
 */
public class ConcreteFactory02 implements Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct02();
    }
}
