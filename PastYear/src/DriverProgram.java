/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class DriverProgram {
    
    public static void main(String[] args) {
        
        Vase[] v = new Vase[2];
        
        v[0] = new SquareVase("S1122", "Wilko Glass", 55.00, 25, 14, 14);
        v[1] = new CylinderVase("C1003", "Rayware", 99.99, 60, 15);
       
        
        
        for(int i = 0; i < v.length; i++){
            if(v[i] instanceof SquareVase){
                System.out.println("Square Vase");
                System.out.println("===========");
                System.out.println(v[i]);
            }else if(v[i] instanceof CylinderVase){
                System.out.println("Cylinder Vase");
                System.out.println("=============");
                System.out.println(v[i]);
            }
        }
        
    }
}
