import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;


class Customer{

    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
class Order{
    int code;
    String description;

    public Order(int code, String description) {
        this.code = code;
        this.description = description;
    }
}

public class MainEx {
    public static void main(String[] args) {
        List<Customer> customers=new ArrayList<>();
        List<Order> orders=new ArrayList<>();

        customers.add(new Customer(100, "Kamal"));
        customers.add(new Customer(101, "Kamal"));
        customers.add(new Customer(102, "Kamal"));
        customers.add(new Customer(103, "Kamal"));
        customers.add(new Customer(104, "Kamal"));
        customers.add(new Customer(105, "Kamal"));
        customers.add(new Customer(106, "Kamal"));
        customers.add(new Customer(107, "Kamal"));
        customers.add(new Customer(108, "Kamal"));
        customers.add(new Customer(109, "Kamal"));

        orders.add(new Order(100, "lkffksfsd"));
        orders.add(new Order(101, "lkffksfsd"));
        orders.add(new Order(102, "lkffksfsd"));
        orders.add(new Order(105, "lkffksfsd"));
        orders.add(new Order(106, "lkffksfsd"));
        orders.add(new Order(109, "lkffksfsd"));

        List<String> strings = new ArrayList<>();

        Set<Integer> codes= new HashSet<>();
        for (Customer c: customers) {
            codes.add(c.code);
        }

        for (Order o: orders){
            if(codes.add(o.code)==false){
                System.out.println(o.code);
            }
        }
    }
}
