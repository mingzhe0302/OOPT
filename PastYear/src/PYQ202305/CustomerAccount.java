/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202305;

public class CustomerAccount {
    
    private String accountNumber;
    private String customerName;
    private double balance;
    private static int totalCustomer;
    
    public CustomerAccount(){
        this("", "", 0.0);
    }

    public CustomerAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        
        totalCustomer++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public static int getTotalCustomer(){
        return totalCustomer;
    }

    @Override
    public String toString(){
        return "Customer Name: " + customerName + "\n"
                + "Account number: " + accountNumber + "\n"
                + "Balance: " + balance + "\n";
    }
    
    
    
}

