package visitor;

/**
 * @author Tian Changqing
 * @date 2022/11/16 16:51
 * @desc
 */
public class Item implements Element{
    private String name;

    Item(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
