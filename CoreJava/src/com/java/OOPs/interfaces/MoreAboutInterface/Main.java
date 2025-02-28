package com.java.OOPs.interfaces.MoreAboutInterface;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * More about interface
 * - We can perform inheritance to interfaces too.
 * - All the members of the interface are public by default.
 * - Also defining static methods to the interface.
 * - UseCase : Interfaces are used in the scenerio where you have define a structure and later on implemented that to the
 *      implementation package so it can be easier to understand that what does it do and it also makes the code as loosely coupled.
 */

// Like i have created a class Customer for just a model class
class Customer {
    int customerId;
    String customerName;

    Customer(int id, String name) {
        this.customerId = id;
        this.customerName = name;
    }
}

// Here it just a draft that what things we have to do with that ok
interface CustomerUtility {

    List<Customer> customers = new ArrayList<>();

    String addCustomer(String name);
    int deleteCustomer();

    static List<Customer> getAllCustomers() {
        return customers;
    }
}

// Here we have a implementation class which implement that interface
class CustomerUtilityImpl implements CustomerUtility {
    
    @Override
    public String addCustomer(String name) {
        int id = new Random().nextInt(9999 - 1000 + 1) + 1000; // It generate a random long 
        Customer newCustomer = new Customer(id, name);
        customers.add(newCustomer);
        return "New Customer is created out with id: " + id;
    }

    @Override
    public int deleteCustomer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Id : ");
        int id = scan.nextInt();
        scan.close();
        for(Customer customer : customers) {
            if(customer.customerId == id) {
                customers.remove(customer);
                return id;
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerUtility customer = new CustomerUtilityImpl();
        String response = customer.addCustomer("Aditya Pawar");
        System.out.println(response);
        System.out.println(customer.addCustomer("Yeshank Pawar"));
        customer.deleteCustomer();
        List<Customer> customers = CustomerUtility.getAllCustomers();
        for(Customer c: customers) {
            System.out.println(c.customerId + " : " + c.customerName);
        }
    }
}
