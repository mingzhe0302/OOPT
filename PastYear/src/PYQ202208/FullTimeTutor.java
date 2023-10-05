/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202208;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class FullTimeTutor extends Tutor{
    
    private double basicSalary;
    
    public FullTimeTutor(String name, boolean permit, int teachingHours, double basicSalary){
        super(name, permit, teachingHours);
        this.basicSalary = basicSalary;
    }
    
    @Override
    protected double calculateSalary(){
      double salary = basicSalary;
        if(teachingHours > 50){
            salary += (teachingHours - 50) * teachingRate;
        }
        
        if(permit){
            salary +=ALLOWANCE;
        }
        
        salary -= salary * INCOMETAX;
        
        return salary;
    }

    public double getBasicSalary(){
        return basicSalary;
    }
    
}
