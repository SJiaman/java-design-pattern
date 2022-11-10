package command;

/**
 * @author Tian Changqing
 * @date 2022/11/10 10:35
 * @desc
 */
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
