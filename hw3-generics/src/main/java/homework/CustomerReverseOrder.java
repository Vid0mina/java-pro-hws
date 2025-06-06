package homework;

import java.util.LinkedList;

public class CustomerReverseOrder {

    LinkedList<Customer> list = new LinkedList<>();

    public void add(Customer customer) {
        list.addFirst(customer);
    }

    public Customer take() {
        return list.poll();
    }

}