/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
import java.util.Scanner;
public class Q4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        password = password.trim();         //remove the space before or after the password
        
        boolean valid = true;
        
        if(password.length() < 7){
            valid = false;
        }
        else{
            int countLetter = 0;
            int countDigit = 0;
            for(int i = 0; i < password.length(); i++){
                char pass = password.charAt(i);
                
                if(Character.isLetter(pass)){
                    countLetter++;
                }
                else if(Character.isDigit(pass)){
                    countDigit++;
                }
                else{
                    valid = false;
                }
                
                if(countLetter == 0 || countDigit == 0){
                    valid = false;
                }
            }
            
            if(valid == true){
                System.out.println("Valid password");
            }
            else{
                System.out.println("Invalid password");
            }
        }
    }
    
    
}
