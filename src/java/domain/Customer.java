
package domain;

import database.CustomerDA;
import exceptions.LoginException;

public class Customer {
    private int customerId;
    private String customerName;
    private int customerPhoneNumber;
    private String userID;
    private String password;
    
    public void add() {
        CustomerDA.add(this);
    }
    
    public static Customer find(int id){
        return CustomerDA.find(id);
    }
    
    public static Customer findByUserId(String uid)throws LoginException{
        return CustomerDA.findByUserId(uid);
    }
   
    public static Customer get(int i) {
        return CustomerDA.get(i);
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
    
    public static int getNumberOfCustomers() {
        return CustomerDA.getNumberOfCustomers();
    }
   
    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }
    
    public static void initialize(){
        CustomerDA.initialize(); 
    }
    
    public static Customer processLogin(String uid, String pass) throws LoginException {
        Customer customer = null;
        try{
         customer = findByUserId(uid);
         if (!customer.getPassword().equals(pass)){
             LoginException ex = new LoginException("Invalid Password");
             throw ex;
         }
        }
        catch(LoginException e){
            
        }
        return customer;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }
  
    public void setCustomerPhoneNumber(int phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String toString() {
        return customerId + "   " + getCustomerName() + "   " + getCustomerPhoneNumber();
    }
}