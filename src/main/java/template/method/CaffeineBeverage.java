package template.method;

/**
 * @author Tian Changqing
 * @date 2022/11/16 9:27
 * @desc
 */
public abstract class CaffeineBeverage {
    /**
     * 模板方法
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 抽象的方法，由子类重新定义
     */
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("BoilWater");
    }

    void pourInCup() {
        System.out.println("PourInCup");
    }
}
