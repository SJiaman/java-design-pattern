package prototype;

/**
 * @author Tian Changqing
 * @date 2022/11/8 11:29
 * @desc 原型模式
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype abc = new ConcretePrototype("abc");
        Prototype prototype = abc.myClone();
        System.out.println(prototype);
    }
}
