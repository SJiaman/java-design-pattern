package nullobject;

/**
 * @author Tian Changqing
 * @date 2022/11/16 17:55
 * @desc 空对象
 *
 * 使用什么都不做的空对象来代替 NULL
 */
public class Client {
    public static void main(String[] args) {
        AbstractOperation operation = fun(1);
        operation.request();
    }

    public static AbstractOperation fun(int i) {
        if (i < 0) {
            return new NullOperation();
        }
        return new RealOperation();
    }
}
