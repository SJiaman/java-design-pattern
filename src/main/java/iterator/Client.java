package iterator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 9:47
 * @desc 迭代器模式
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
