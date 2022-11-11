package iterator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 9:41
 * @desc
 */
public interface Iterator<Item> {
    Item next();

    boolean hasNext();
}
