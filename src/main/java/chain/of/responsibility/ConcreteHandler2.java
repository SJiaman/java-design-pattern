package chain.of.responsibility;

/**
 * @author Tian Changqing
 * @date 2022/11/10 10:01
 * @desc
 */
public class ConcreteHandler2 extends Handler{
    public ConcreteHandler2(Handler handler) {
        super(handler);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println(request.getName() + " is handle by ConcreteHandler2");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
