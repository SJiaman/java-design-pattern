package factory.method;

/**
 * @author Tian Changqing
 * @date 2022/11/9 10:13
 * @desc 工厂方法
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类
 */
public class Client {
    public static void main(String[] args) {
        Factory concreteFactory01 = new ConcreteFactory01();
        Product product = concreteFactory01.factoryMethod();
    }
}
