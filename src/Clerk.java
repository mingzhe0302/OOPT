/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Clerk extends Employee {
    
    private double allowance;
    private int overtimeHours;
    private static double overTimeRate;

    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public static double getOverTimeRate() {
        return overTimeRate;
    }

    public static void setOverTimeRate(double overTimeRate) {
        Clerk.overTimeRate = overTimeRate;
    }

    @Override
    public String toString() {
        return super.toString() + "Clerk Allowance [ allowance = " + allowance + ", overtimeHours = " + overtimeHours 
                + ", overtimeRate = " + Clerk.overTimeRate + "]";
    }
    
    @Override
    public double calculateSalary(){
        return super.getBasicSalary() + getAllowance() + getOvertimeHours() * getOverTimeRate(); 
    }
    

         public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Clerk clerk = (Clerk) obj;

        return Double.compare(clerk.allowance, allowance) == 0 &&
               overtimeHours == clerk.overtimeHours &&
               Double.compare(Clerk.overTimeRate, overTimeRate) == 0;
    }
    
}
