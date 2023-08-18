/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Q2 {
    
    public static void main(String[] args) {
        
        Employee[] empArray = new Employee[3]; 
        
        empArray[0] = new Employee("Soh", 2008, 3000.00);
        empArray[1] = new CommissionEmployee("JeeSchuan", 2003, 3000.00, 1500.00, 0.20);
        empArray[2] = new Clerk("Felicia", 2022, 5000.00, 200.00, 12);
        
        
    }
    
    public static void printElements(Employee[] eArray){
        
        for(int i = 0; i < eArray.length; i++){
            if(eArray[i] instanceof Employee)
                System.out.println("\n Type of Employee: Employee");
            
            else if(eArray[i] instanceof CommissionEmployee)
                System.out.println("\n Type of Employee: Commission Employee");
            
            else if(eArray[i] instanceof Clerk)
                System.out.println("\n Type of Employee: Clerk");
                
            
            System.out.println(eArray[i]);
            System.out.printf("Monthly Salary: RM%.2f\n", eArray[i].calculateSalary());
        }
        
        
    }
}
