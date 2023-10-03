/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202305_2;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class AccountingClerk extends Employee {
    private double overtimeHour;
    private final double OT_RATE = 40.0;
    
    public AccountingClerk(String name, int staffID, double overtimeHour){
        super(name, staffID);
        this.overtimeHour = overtimeHour;
    }
    
    public double calcOvertime(){
        double overtimeEarning = overtimeHour * OT_RATE;
        return overtimeEarning;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "Overtime Hour: " + overtimeHour + "\n";
                
    }

}
