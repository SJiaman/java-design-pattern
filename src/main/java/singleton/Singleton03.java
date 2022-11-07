package singleton;

/**
 * @author Tian Changqing
 * @date 2022/11/7 17:49
 * @desc 双重校验锁-线程安全
 */
public class Singleton03 {
    private volatile static Singleton03 uniqueInstance;

    private Singleton03() {
    }

    public static Singleton03 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton03.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton03();
                }
            }
        }
        return uniqueInstance;
    }
}
