package chain.of.responsibility;

/**
 * @author Tian Changqing
 * @date 2022/11/10 9:57
 * @desc
 */
public abstract class Handler {
    protected Handler successor;


    public Handler(Handler successor) {
        this.successor = successor;
    }


    protected abstract void handleRequest(Request request);
}
