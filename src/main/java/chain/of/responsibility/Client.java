package chain.of.responsibility;

/**
 * @author Tian Changqing
 * @date 2022/11/10 10:02
 * @desc 责任链模式
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止
 */
public class Client {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1(null);
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2(concreteHandler1);

        Request request1 = new Request(RequestType.TYPE1, "request1");
        concreteHandler2.handleRequest(request1);

        Request request2 = new Request(RequestType.TYPE2, "request2");
        concreteHandler2.handleRequest(request2);
    }
}
