/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Vase {
    
    protected String ID;
    protected String brand;
    protected double price;
    protected int height;
    
    public Vase(){
        
    }
    
    public Vase(String ID, String brand, double price, int height){
        
        this.ID = ID;
        this.brand = brand;
        this.price = price;
        this.height = height;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    @Override
    public String toString(){
        return "ID: " + ID + "\n"
                + "Brand: " + brand + "\n"
                + "Price: RM " + price + "\n"
                + "Height: " + height;
    }
}
