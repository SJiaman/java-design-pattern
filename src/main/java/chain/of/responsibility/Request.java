package chain.of.responsibility;

/**
 * @author Tian Changqing
 * @date 2022/11/10 9:58
 * @desc
 */
public class Request {
    private RequestType type;
    private String name;


    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }


    public RequestType getType() {
        return type;
    }


    public String getName() {
        return name;
    }
}
