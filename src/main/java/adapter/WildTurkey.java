package adapter;

/**
 * @author Tian Changqing
 * @date 2022/11/18 17:38
 * @desc
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
