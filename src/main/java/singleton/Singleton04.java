package singleton;

/**
 * @author Tian Changqing
 * @date 2022/11/7 17:52
 * @desc 静态内部类实现
 */
public class Singleton04 {
    private Singleton04() {

    }

    private static class singleton04Holder {
        private static final Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getSingleton04() {
        return singleton04Holder.INSTANCE;
    }
}
