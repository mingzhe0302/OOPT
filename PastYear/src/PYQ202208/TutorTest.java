/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202208;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class TutorTest {
    
    public static void main(String[] args) {
        Tutor[] t = new Tutor[4];
        
        t[0] = new PartTimeTutor("Mario Ani", false, 60);
        t[1] = new FullTimeTutor("Normula Junin", false, 60, 5000.00);
        t[2] = new PartTimeTutor("Michaelis Daniel", true, 50);
        t[3] = new FullTimeTutor("Delisha Danish", true, 40, 3000.00);
        
        for(Tutor tutor: t){
            if(tutor instanceof PartTimeTutor){
                System.out.println("PartTimeTutor");
                System.out.println("--------------");
                System.out.print(tutor.toString());
                System.out.println("Salary: RM " + tutor.calculateSalary());
                System.out.println();
                System.out.println();
            }
            
            else if(tutor instanceof FullTimeTutor){
                System.out.println("FullTimeTutor");
                System.out.println("--------------");
                System.out.print(tutor.toString());
                System.out.println("Basic Salary: RM" + ((FullTimeTutor) tutor).getBasicSalary());
                System.out.println("Salary: RM " + tutor.calculateSalary());
                System.out.println();
                System.out.println();
            }
        }
               
    }
}
