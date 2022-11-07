package simple.factory;

/**
 * @author Tian Changqing
 * @date 2022/11/7 16:59
 * @desc
 */
public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new Product01();
        }
        return new Product02();
    }
}
