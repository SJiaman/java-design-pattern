package iterator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 9:41
 * @desc
 */
public class ConcreteAggregate implements Aggregate{
    private Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}
