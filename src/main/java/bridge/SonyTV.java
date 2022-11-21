package bridge;

/**
 * @author Tian Changqing
 * @date 2022/11/18 17:54
 * @desc
 */
public class SonyTV extends TV{
    @Override
    public void on() {
        System.out.println("SonyTV.on");
    }

    @Override
    public void off() {
        System.out.println("SonyTV.off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("SonyTV.tuneChannel");
    }
}
