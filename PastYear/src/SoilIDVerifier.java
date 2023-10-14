/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class SoilIDVerifier {
    
    public static boolean verifySoilID(String ID){
        if(ID.length() != 10){
            return false;
        }
        
        String type = ID.substring(0, 3);
        String digits = ID.substring(3, 9);
        String size = ID.substring(9);
        
        if(!(type.equals("PTY") || type.equals("SDY") || type.equals("CLY") || type.equals("LMY"))){
            return false;
        }
        
        for(int i = 0; i < 6; i++){
            if(!Character.isDigit(digits.charAt(i))){
                return false;
            }
        }
        
        return size.equals("S") || size.equals("M") || size.equals("L");
        
    }
    
}

