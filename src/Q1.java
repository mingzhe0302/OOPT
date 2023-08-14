/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
import java.util.*;
public class Q1 {
    
      public static int countLetter(String str, char ch){
      
          int count = 0;
          for(int i = 0; i < str.length(); i++){
              if(str.charAt(i) == ch){
                  count++;
              }
          }
          
          return count;
      }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        System.out.print("Enter the letter you want to count: ");
        char letter = sc.next().charAt(0);
        
        int occurences = countLetter(word, letter);
        System.out.printf("%s contain %d%c\n", word,occurences,letter);
    }
    
    
  
    
}
