package factory.method;

/**
 * @author Tian Changqing
 * @date 2022/11/9 10:06
 * @desc
 */
public interface Factory {
    Product factoryMethod();
     default void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
