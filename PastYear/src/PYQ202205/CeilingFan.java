/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202205;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class CeilingFan extends Fan{
    
    private boolean hasLEDLight;
    
    public CeilingFan(int numberOfBlades, boolean hasLEDLight){
        super(500, numberOfBlades);
        this.hasLEDLight = hasLEDLight;
        if(hasLEDLight){
            this.price += 300;
        }
      
    }
    
    @Override
    public double getPrice(){
            return price;
    }
}
