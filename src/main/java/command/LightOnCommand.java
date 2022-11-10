package command;

/**
 * @author Tian Changqing
 * @date 2022/11/10 10:33
 * @desc
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
