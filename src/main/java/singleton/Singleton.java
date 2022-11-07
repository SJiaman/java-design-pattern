package singleton;

/**
 * @author Tian Changqing
 * @date 2022/11/7 17:59
 * @desc 枚举实现，该实现可以防止反射攻击
 */
public enum Singleton {
    INSTANCE;

    private String objName;


    public String getObjName() {
        return objName;
    }


    public void setObjName(String objName) {
        this.objName = objName;
    }

}
