package simple.factory;

/**
 * @author Tian Changqing
 * @date 2022/11/7 16:58
 * @desc 简单工厂
 */
public class Client {
    public static void main(String[] args) {
        int type = 1;

        // 不使用简单工厂
        if (type == 1) {
            Product01 product01 = new Product01();
        } else {
            Product02 product02 = new Product02();
        }

        // 使用简单工厂  不暴露细节
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(type);



    }
}
