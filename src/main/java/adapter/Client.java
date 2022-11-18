package adapter;

/**
 * @author Tian Changqing
 * @date 2022/11/18 17:40
 * @desc 适配器模式
 * 把一个类接口转换成另一个用户需要的接口。
 */
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duckAdapter = new DuckAdapter(turkey);
        duckAdapter.quack();
    }
}
