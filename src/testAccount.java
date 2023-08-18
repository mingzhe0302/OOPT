/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class testAccount {
    
    public static void main(String[] args) {
        Account a = new Account("98765", 5000);
	  savingAccount s = new savingAccount("12345", 2000);
	  currentAccount c = new currentAccount("77880", 1000);
	    
	  System.out.println("Account info: \n" + a.toString());
	  System.out.println("\nSavings account info: \n" + s.toString());
	  
	  c.withdraw(100.00);
	  c.deposit(500.00);
	  c.withdraw(200.00);
	  System.out.println("\nCurrent account info: \n" + c.toString());
	  
	  savingAccount s2 = new savingAccount("12345", 5000);
	  savingAccount s3 = new savingAccount("12344", 2200);
	  
	  System.out.println("\ns equals s2: " + s.equals(s2));
	  System.out.println("s equals s3: " + s.equals(s3));
    }
}
