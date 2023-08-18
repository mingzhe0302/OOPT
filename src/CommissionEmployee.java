/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class CommissionEmployee extends Employee{
    
    private double grossSale;
    private double commissionRate;
    
    public CommissionEmployee(String name, int yearJoined, double basicSalary, double grossSale, double commissionRate){
        super(name, yearJoined, basicSalary);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        
    }
    
    //getter

    public double getGrossSale() {
        return grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    
    //setter

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    @Override
    
    public String toString(){
        return super.toString() + " Commission Employee [grossSale= " + grossSale + ", commissionRate= " + commissionRate + "]";
    }
    
    @Override
    
    public double calculateSalary(){
         return super.getBasicSalary() + getGrossSale() * getCommissionRate();
        
    }
    
    public boolean equals(Object obj){
           if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        CommissionEmployee that = (CommissionEmployee) obj;

        return Double.compare(that.grossSale, grossSale) == 0 &&
               Double.compare(that.commissionRate, commissionRate) == 0;
    }
}
