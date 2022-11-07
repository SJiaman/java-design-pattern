package singleton;

/**
 * @author Tian Changqing
 * @date 2022/11/7 16:48
 * @desc 懒汉式 - 线程安全
 */
public class Singleton02 {
    private static Singleton02 uniqueInstance;

    private Singleton02() {
    }

    public static synchronized  Singleton02 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton02();
        }
        return uniqueInstance;
    }
}
