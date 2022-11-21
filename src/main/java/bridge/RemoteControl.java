package bridge;

/**
 * @author Tian Changqing
 * @date 2022/11/18 17:52
 * @desc
 */
public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
