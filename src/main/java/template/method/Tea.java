package template.method;

/**
 * @author Tian Changqing
 * @date 2022/11/16 9:35
 * @desc
 */
public class Tea extends CaffeineBeverage{
    /**
     * 抽象的方法，由子类重新定义
     */
    @Override
    void brew() {
        System.out.println("Tea.Brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.Add");
    }
}
