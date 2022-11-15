package state;

/**
 * @author Tian Changqing
 * @date 2022/11/15 17:15
 * @desc 状态模式
 * 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它所属的类
 */
public class Client {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();


        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();


    }
}
