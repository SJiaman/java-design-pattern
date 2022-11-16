package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tian Changqing
 * @date 2022/11/16 16:52
 * @desc
 */
public class CustomerGroup {
    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
