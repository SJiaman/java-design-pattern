package prototype;

/**
 * @author Tian Changqing
 * @date 2022/11/8 11:27
 * @desc
 */
public class ConcretePrototype extends Prototype{
    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "filed='" + filed + '\'' +
                '}';
    }
}
