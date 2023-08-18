/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
import java.util.Date;
public class Account {
    
    private String accNo;
    private double balance;
    private Date dateCreated;
    
    public Account(String accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
      
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public void deposit(double amount){
        balance += amount;
     
    }
    
    public boolean withdraw(double amount){
        
        if(amount > balance){
            return false;
        }
        else{
            balance -= amount;
            return true;
        }
    }
    
    //Q2 (b)
    public String toString(){
        return "Account Number: " + accNo + "\n" + "Balance: " + balance + "\n";
    }
    
    //Q2(c)
    public boolean equals(Object obj){
        
        Account otherAcc = (Account)obj;
        if(accNo == otherAcc.getAccNo()){
            return true;
        }
        else
            return false;
    }
    
    
}
