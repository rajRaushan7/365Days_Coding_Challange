package Java.Day172;

import java.util.*;

class Customer {
    String name;
    int age;
    char gender;

    public Customer(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class SmartBankQueue {

    public static void main(String[] args) {
        Customer[] customers = {
            new Customer("Raj", 65, 'M'),
            new Customer("Priya", 28, 'F'),
            new Customer("Anil", 45, 'M'),
            new Customer("Sunita", 62, 'F'),
            new Customer("Rohit", 22, 'M'),
            new Customer("Neha", 35, 'F')
        };

        Queue<Customer> seniors = new LinkedList<>();
        Queue<Customer> women = new LinkedList<>();
        Queue<Customer> others = new LinkedList<>();

        for (Customer c : customers) {
            if (c.age >= 60) {
                seniors.add(c);
            } else if (c.gender == 'F') {
                women.add(c);
            } else {
                others.add(c);
            }
        }

        System.out.println("Serving Customers in Smart Queue Order:");
        serveQueue(seniors);
        serveQueue(women);
        serveQueue(others);
    }

    static void serveQueue(Queue<Customer> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().name);
        }
    }
}