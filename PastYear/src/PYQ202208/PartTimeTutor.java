/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202208;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class PartTimeTutor extends Tutor{
    
   public PartTimeTutor(String name, boolean permit, int teachingHours){
       super(name, permit,teachingHours);
   }
   
   @Override
   protected double calculateSalary(){
       double salary = teachingHours * teachingRate;
       if(permit){
           salary += ALLOWANCE;
       }
       
       salary -= salary * INCOMETAX;
       return salary;
   }
   


}
