package builder;

/**
 * @author Tian Changqing
 * @date 2022/11/8 11:01
 * @desc
 */
public class StringBuilder extends AbstractStringBuilder{
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
