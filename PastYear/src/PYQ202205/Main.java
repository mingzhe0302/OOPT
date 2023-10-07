/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202205;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Main {
    
    public static void main(String[] args) {
        Fan[] fans = new Fan[3];
        
        fans[0] = new WallFan(3, true);   //Assuming WallFan class is created
        fans[1] = new CeilingFan(5, false);
        fans[2] = new StandFan(4, true);   //Assuming WallFan class is created
        
        for(Fan fan: fans){
            System.out.println(fan.toString());
        }
        
        for(Fan fan: fans){
            if(fan instanceof CeilingFan){
                System.out.println("Ceiling Fan");
            }else if(fan instanceof WallFan){
                System.out.println("Wall Fan: ");
            }else if(fan instanceof StandFan){
            
                System.out.println("Stand Fan: ");
            }
            
            System.out.println("Price: RM " + fan.getPrice());
            System.out.println("Number of Blades: " + fan.numberOfBlades);
            System.out.println();
        }
    }
}
