package homework;

import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    private final TreeMap<Customer, String> map = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> entry = map.firstEntry();
        return Map.entry(copy(entry.getKey()), entry.getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> entry = map.higherEntry(customer);
        return entry == null ? null : Map.entry(copy(entry.getKey()), entry.getValue());
    }

    public void add(Customer customer, String data) {
        map.put(new Customer(customer.getId(), customer.getName(), customer.getScores()), data);
    }

    private Customer copy(Customer original) {
        return new Customer(original.getId(), original.getName(), original.getScores());
    }

}