package com.ClientS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService(List<Customer> customers) {
        this.customers = new ArrayList<>(customers);
    }

    public List<Customer> getCustomersSortedAlphabetically() {
        List<Customer> sortedCustomers = new ArrayList<>(customers);
        Collections.sort(sortedCustomers, (c1, c2) ->
                c1.getLastName().compareToIgnoreCase(c2.getLastName()));
        return sortedCustomers;
    }

    public List<Customer> getCustomersByCreditCardRange(String startRange, String endRange) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber().compareTo(startRange) >= 0 &&
                    customer.getCreditCardNumber().compareTo(endRange) <= 0) {
                result.add(customer);
            }
        }
        return result;
    }
}