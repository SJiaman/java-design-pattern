package bridge;

/**
 * @author Tian Changqing
 * @date 2022/11/18 17:55
 * @desc
 */
public class ConcreteRemoteControl extends RemoteControl{
    public ConcreteRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl.on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl.off");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl.tuneChannel");
        tv.tuneChannel();
    }
}
