/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class CylinderVase extends Vase{
    
    private int diameter;
    
    public CylinderVase(){
        
    }

    public CylinderVase(int diameter) {
        this.diameter = diameter;
    }

    public CylinderVase(String ID, String brand, double price, int height, int diameter) {
        super(ID, brand, price, height);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n"
                + "diameter: " + diameter + "\n";
    }
}
