package template.method;

/**
 * @author Tian Changqing
 * @date 2022/11/16 9:33
 * @desc
 */
public class Coffee extends CaffeineBeverage{
    /**
     * 抽象的方法，由子类重新定义
     */
    @Override
    void brew() {
        System.out.println("Coffee.Brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.AddCondiMents");
    }
}
