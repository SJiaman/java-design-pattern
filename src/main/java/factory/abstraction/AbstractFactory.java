package factory.abstraction;

/**
 * @author Tian Changqing
 * @date 2022/11/9 10:44
 * @desc 超级工厂 创建其他工厂的工厂
 */
public interface AbstractFactory {
    ProductA createProductA();

    ProductB createProductB();
}
