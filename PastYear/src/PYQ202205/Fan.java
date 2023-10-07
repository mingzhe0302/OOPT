/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202205;

/**
 *
 * @author Yeoh Ming Zhe
 */
public abstract class Fan {
    
    protected double price;
    protected int numberOfBlades;
    
    protected Fan(double basePrice, int numberOfBlades){
        this.price = basePrice;
        this.numberOfBlades = numberOfBlades;
    }
    
    public abstract double getPrice();
    
    
    
}
