/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202208;

/**
 *
 * @author Yeoh Ming Zhe
 */
public abstract class Tutor implements Tax {
    
    protected String name;
    protected boolean permit;
    protected int teachingHours;
    protected static double teachingRate = 80.0;
    protected final double ALLOWANCE = 30.0;
   
    
    
    protected Tutor(String name, boolean permit, int teachingHours){
        this.name = name;
        this.permit = permit;
        this.teachingHours = teachingHours;
     
    }
    
    
    protected abstract double calculateSalary();
   
    
    @Override
    public double calculateIncomeTax(){
        return calculateSalary() * INCOMETAX;
    }
    
    @Override
    public String toString(){
        String permitStatus = permit ? "Yes" : "No";
        return "Name: " + name +"\n"
                + "Permit: " + permitStatus + "\n"
                + "Teaching Hours: " + teachingHours + "\n";
                
    }
}
