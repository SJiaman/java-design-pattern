package visitor;

/**
 * @author Tian Changqing
 * @date 2022/11/16 16:50
 * @desc
 */
public interface Element {
    void accept(Visitor visitor);
}
