package visitor;

/**
 * @author Tian Changqing
 * @date 2022/11/16 16:51
 * @desc
 */
public interface Visitor {
    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}
