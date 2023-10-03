/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202305_2;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class SalesAssistant extends Employee {
    private double salesAmount;
    private final double COMMISSION_RATE = 0.1;
    

    public SalesAssistant(String name, int staffID, double salesAmount) {
        super(name, staffID);
        this.salesAmount = salesAmount;
    }
    
    public double calcCommission(){
        double totalCommission = salesAmount * COMMISSION_RATE;
        return totalCommission;
    }

    @Override
    public String toString() {
        return  
                super.toString() + 
                "Sales Amount: " + salesAmount + "\n";
                 
    }
}
