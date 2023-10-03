/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202305_2;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Driver {
    
    public static void main(String[] args) {
        SalesAssistant s1 = new SalesAssistant("Jared Justin", 1234, 5600);
        AccountingClerk c1 = new AccountingClerk("Alia Tasmin", 7890, 20);
        
        System.out.println("Sales Assistant");
        System.out.print(s1.toString());
        System.out.print("Total Commission: RM " + s1.calcCommission());
        
        System.out.printf("\n\n\n");
        
        System.out.println("Accounting Clerk");
        System.out.print(c1.toString());
        System.out.println("Total Overtime Earning: RM " + c1.calcOvertime());
        
        System.out.printf("\n\n\n");
        
        System.out.println("Process completed");
    }
}
