package singleton;

/**
 * @author Tian Changqing
 * @date 2022/11/7 16:33
 * @desc 懒汉式 - 线程不安全
 */
public class Singleton01 {
    private static Singleton01 uniqueInstance;

    private Singleton01() {
    }

    public static Singleton01 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton01();
        }
        return uniqueInstance;
    }
}
