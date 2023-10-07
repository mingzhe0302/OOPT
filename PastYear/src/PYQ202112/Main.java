/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202112;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Main {
    
    public static void main(String[] args) {
        Student[] s = new Student[2];
        
        s[0] = new FullTimeStudent("D1234", "Lee Chong Wei", "DFT", 2,
                "016-1234567", "Lorong 3, No. 1 Jalan Ceria", "016-3453456");
        
        s[1] = new PartTimeStudent("D2345", "Rashid Sidek", "DSF", 1, 
                "016-8787876", "No. 2 Jalan Bersatu", "Level 5, Bangunan Duta", "03-1234567");
        
        for(Student std: s){
            if(std instanceof FullTimeStudent){
                System.out.println("====== Full-Time Student =====\n");
                System.out.println(std.toString());
                
            }else if(std instanceof PartTimeStudent){
                System.out.println("====== Part-Time Student =====\n");
                System.out.println(std.toString());
            }
            
           
        }
        
        
    }
}
