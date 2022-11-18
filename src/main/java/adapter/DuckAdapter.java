package adapter;

/**
 * @author Tian Changqing
 * @date 2022/11/18 17:39
 * @desc
 */
public class DuckAdapter implements Duck{
    private Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
