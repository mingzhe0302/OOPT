/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202305;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Driver {
     public static void main(String[] args) {
        CustomerAccount c1 = new CustomerAccount();
        CustomerAccount c2 = new CustomerAccount("AC9876", "Abigail Chong" , 3000);
        c1.setAccountNumber("AC1234");
        c1.setCustomerName("Abbel Leowanday");
        c1.setBalance(6000);
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println("Total of Customer:" + CustomerAccount.getTotalCustomer());
    }
}
