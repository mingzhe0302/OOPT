/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class savingAccount extends Account{
    
    private static double interestRate = 0.02;
    
    public savingAccount(String accNo, double balance){
        super(accNo, balance);
    }
    
    public static double getInterestRate(){
        return interestRate;
    }
    
    public static void setInterestRate(double interestRate){
        savingAccount.interestRate = interestRate;
    }
    
    public double calInterest(){
        return super.getBalance() * interestRate / 12;
    }
    
    public void addInterest(){
        super.deposit(calInterest());
    }
}
