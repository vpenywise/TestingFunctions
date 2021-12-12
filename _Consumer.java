package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// VOID

public class _Consumer {

    public static void main(String[] args) {

        // Normal java function
        Customer pesho = new Customer("Pesho", "9999999");
        greetCustomer(pesho);
        greetCustomerV2(pesho, false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(pesho);

        // BiConsumer taking 2 arguments
        greetCustomerConsumerV2.accept(pesho, false);

    }

    // BiConsumer ; taking 2 arguments
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    // Declarative coding
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    // Imperative coding
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    // Imperative coding V2
    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNumber : "**********"));
    }

    // the Class
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
