package dev.lpa;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tim", 1000);
        Customer customer2 = new Customer("Joe", 0);

        Bank bank = new Bank("My Bank");

        Customer duplicateTim = new Customer("tim", 300);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(duplicateTim);

        bank.addTransaction(customer1, 250.0);
        bank.addTransaction(customer2, -50.0);
        bank.addTransaction(new Customer("NotExist", 0), 100.0);

        bank.print();

    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer) {
        for (Customer c : customers) {
            if (c.name().equalsIgnoreCase(customer.name())) {
                System.out.println("This customer has already been added");
                return;
            }
        }

        customers.add(customer);
    }

    public void addTransaction(Customer customer, Double value) {
        for (Customer c : customers) {
            if (c.name().equalsIgnoreCase(customer.name())) {
                c.transactions().add(value);
            }
        }
    }

    public void print() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}