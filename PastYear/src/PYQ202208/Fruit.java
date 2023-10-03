/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202208;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Fruit {
    private String id;
    private String type;
    private String color;
    private double price;
    private static int totalTypeOfFruit;
    
    public Fruit(){
        totalTypeOfFruit++;
    }

    public Fruit(String id, String type, String color, double price) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.price = price;
        
        totalTypeOfFruit++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalTypeOfFruit() {
        return totalTypeOfFruit;
    }

    @Override
    public String toString(){
        return "Fruit ID: " + id + "\n" 
               + "Fruit Type: " + type + "\n"
               + "Color: " + color + "\n"
               + "Price: RM " + price + "\n";
               
                       
    }
    
    
}
