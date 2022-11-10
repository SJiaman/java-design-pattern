package command;

/**
 * @author Tian Changqing
 * @date 2022/11/10 10:37
 * @desc 命令模式
 * 将命令封装成对象中，具有以下作用：
 *
 * 使用命令来参数化其它对象
 * 将命令放入队列中进行排队
 * 将命令的操作记录到日志中
 * 支持可撤销的操作
 *
 * 行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，
 * 比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Invoker invoker = new Invoker();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        invoker.setOffCommand(lightOffCommand, 0);
        invoker.setOnCommand(lightOnCommand, 0);

        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}
