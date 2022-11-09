package factory.method;

/**
 * @author Tian Changqing
 * @date 2022/11/9 10:10
 * @desc
 */
public class ConcreteFactory01 implements Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct01();
    }

}
