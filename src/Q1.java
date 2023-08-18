/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Q1 {
    
    public static void main(String[] args) {
        savingAccount savingAcc = new savingAccount("123", 1000);
        currentAccount currentAcc = new currentAccount("456", 1000);
        
        
        //current
        System.out.println("The current account " + currentAcc.getAccNo() + "has balance of " + currentAcc.getBalance() + " .");
        currentAcc.deposit(100);
        
        
        //deposit
        System.out.println("The current account " + currentAcc.getAccNo() + "has balance of " + currentAcc.getBalance() + " after deposit.");
        
        
        
        currentAcc.withdraw(100);
        
        
        if(!currentAcc.withdraw(2000)){
            System.out.println("Withdrawal had exceed balance.");
        }
        
        
        //withdraw
        System.out.println("The current account " + currentAcc.getAccNo() + " has balance of" + currentAcc.getBalance() + " after withdraw.");
        
        //saving account test
        System.out.println("The saving account " + savingAcc.getAccNo() + " has balance of" + savingAcc.getBalance() + " withdraw.");
        savingAcc.addInterest();
        System.out.println("The saving account " + savingAcc.getAccNo() + " has balance of" + savingAcc.getBalance() + " after adding interest.");
        
       
        
        
    }
}
