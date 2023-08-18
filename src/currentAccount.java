/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class currentAccount extends Account {
    
    private static int freeTransactionCount = 2;
    private static double transactionFee = 1.0;
    private int transactionCount;
    
    
    public currentAccount(String accNo, double balance){
        super(accNo, balance);
        transactionCount = 0;
    }

    public static int getFreeTransactionCount() {
        return freeTransactionCount;
    }

    public static void setFreeTransactionCount(int freeTransactionCount) {
        currentAccount.freeTransactionCount = freeTransactionCount;
    }

    public static double getTransactionFee() {
        return transactionFee;
    }

    public static void setTransactionFee(double transactionFee) {
        currentAccount.transactionFee = transactionFee;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }
    
    public void addTransactionCount(){
        transactionCount++;
    }
    
    public void deductTransactionFee(){
        super.withdraw(transactionFee);
    }
    
     //Q2
    @Override
        public void deposit(double amount){
            super.deposit(amount);
            addTransactionCount();
            
            if(transactionCount > freeTransactionCount){
                deductTransactionFee();
            }
        }
        
    @Override
        public boolean withdraw(double amount){
            boolean success = super.withdraw(amount);
            
            if(success){
                addTransactionCount();
                
                if(transactionCount > freeTransactionCount){
                    deductTransactionFee();
                }
            }
            
            return success;
        }
        
        //Q2(b)
        @Override
        public String toString(){
            return super.toString() + "Transaction Count: " + transactionCount + "\n";
        }
        
        
        
}
