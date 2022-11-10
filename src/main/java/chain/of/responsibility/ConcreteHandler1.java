package chain.of.responsibility;

/**
 * @author Tian Changqing
 * @date 2022/11/10 9:59
 * @desc
 */
public class ConcreteHandler1 extends Handler{
    public ConcreteHandler1(Handler handler) {
        super(handler);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println(request.getName() + " is handle by ConcreteHandler1");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
