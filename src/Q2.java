/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
import java.util.*;
import java.lang.String;
public class Q2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        
        String modifyStr = strModify(inputStr);
        System.out.printf("Modified String: %s\n", modifyStr);
    }
    
    
    public static String strModify(String modify){
        
        modify = modify.toUpperCase();
        
        modify = modify.replaceAll("[AEIOUaeiou]", "x");
        
        return modify;
    }
}
