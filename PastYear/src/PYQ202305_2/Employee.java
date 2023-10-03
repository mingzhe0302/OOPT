/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202305_2;

/**
 *
 * @author Yeoh Ming Zhe
 */


public class Employee {
     protected String name;
    protected int staffID;
    
    
    public Employee(String name, int staffID){
        this.name = name;
        this.staffID = staffID;
    }
    
     @Override
    public String toString(){
        return "Name: " + name + "\n"
                + "Staff ID: " + staffID + "\n";
    }
    
}
