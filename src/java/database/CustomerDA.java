package database;

import exceptions.LoginException;
import domain.Customer;
import java.util.ArrayList;

public class CustomerDA {
    
    private static ArrayList<Customer> customerList = new ArrayList<Customer> (5);
    
    public static void add(Customer c) {
        customerList.add(c);
    }
    
    public static Customer find(int id) {
        for(int i = 0; i < customerList.size(); i++)
            if(customerList.get(i).getCustomerId() == id)
                return customerList.get(i);
        return null;
    }
    
    public static Customer findByUserId(String uid) throws LoginException{
        for (int i = 0; i < customerList.size(); i++){
            if (findByUserId.get(i).getCustomerID() == uid)
                return findByUserId.get(i);
        }
        LoginException e = new LoginException("User id" + uid + " not found");
        throw e;
        
    }
    
    public static Customer get(int i) {
        return customerList.get(i);
    }
    
    public static int getNumberOfCustomers() {
        return customerList.size();
    }
    
    public static void initialize(){
        Customer c;
        
        c = new Customer();
        c.setCustomerId(100);
        c.setCustomerName("Customer One");
        c.setCustomerPhoneNumber(5551212);
        c.setUserID("Cust1");
        c.setPassword("cust1");
        c.add();
       
        c = new Customer();
        c.setCustomerId(200);
        c.setCustomerName("Customer Two");
        c.setCustomerPhoneNumber(4172121);
        c.setUserID("Cust2");
        c.setPassword("cust2");
        c.add();
       
        c = new Customer();
        c.setCustomerId(300);
        c.setCustomerName("Customer Three");
        c.setCustomerPhoneNumber(5553125);
        c.setUserID("Cust3");
        c.setPassword("cust3");
        c.add();
    }
}