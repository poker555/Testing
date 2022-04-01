package Sales;

import java.util.ArrayList;

public class SalesTester
{
    public static void main(String[] args)
    {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer)
        Customer c1 = new Customer("0001",800);
        Customer c2 = new Customer("0002",1200);
        SilverCustomer c3 = new SilverCustomer("0003",2000);
        GoldenCustomer c4 = new GoldenCustomer("0004",5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}
