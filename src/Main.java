import com.ClientS.*;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Зубенко", "Михаїл", "Петрович",
                "8 березня", "123-456-7890", "1234567812345678", "987654321");
        Customer customer2 = new Customer("Панасов", "Іван", "Батькович",
                "9 січня", "987-654-3210", "8765432187654321", "123456789");

        CustomerService customerService = new CustomerService(List.of(customer1, customer2));

        List<Customer> sortedCustomers = customerService.getCustomersSortedAlphabetically();
        System.out.println("Клієнти відсортовані за алфавітом:");
        for (Customer customer : sortedCustomers) {
            System.out.println(customer);
        }

        String startRange = "1000000000000000";
        String endRange = "2000000000000000";
        List<Customer> customersInRange = customerService.getCustomersByCreditCardRange(startRange, endRange);
        System.out.println("\nCписок покупців, номер кредитної картки яких перебуває у заданому\n" + "інтервалі:");
        for (Customer customer : customersInRange) {
            System.out.println(customer);
        }
    }
}