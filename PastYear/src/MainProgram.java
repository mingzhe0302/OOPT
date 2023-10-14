/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class MainProgram {
    
    public static void main(String[] args) {
        Flower f1 = new Flower("F101", "Rose", "Red", 169.99);
        
        Flower f2 = new Flower();
        f2.setID("F102");
        f2.setName("Tulip");
        f2.setColor("White");
        f2.setPricePerBouquet(188.80);
        
        System.out.println("ID: " + f1.getID());
        System.out.println("Name: " + f1.getName());
        System.out.println("Color: " + f1.getColor());
        System.out.println("Price per bonquet: RM " + f1.getPricePerBouquet());
        
        System.out.println();
        
        System.out.println("ID: " + f2.getID());
        System.out.println("Name: " + f2.getName());
        System.out.println("Color: " + f2.getColor());
        System.out.println("Price per bonquet: RM " + f2.getPricePerBouquet());
        
        System.out.println();
        System.out.println();
        
        System.out.println("Total of Flowers Type: " + Flower.getTotalOfFlowersType());
        
        System.out.println();
        
        System.out.println("Process completed.");
    }
}
