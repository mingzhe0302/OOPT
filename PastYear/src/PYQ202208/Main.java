/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202208;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Main {
    
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.setId("FR1005");
        f1.setType("Rambutan");
        f1.setColor("Red");
        f1.setPrice(15.00);
        
        Fruit f2 = new Fruit("FR1006", "Banana", "Yellow", 10.00);
        
        System.out.print(f1.toString());
        System.out.printf("\n\n");
        System.out.print(f2.toString());
        System.out.printf("\n\n");
        System.out.println("Total type of Fruit: " + Fruit.getTotalTypeOfFruit());
    }
}
