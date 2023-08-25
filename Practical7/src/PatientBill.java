/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public abstract class PatientBill {
    protected int visitID;
    protected String name;
    private static int incrementNo = 1;
    public abstract double calTotalCharges();
    
    public PatientBill(String name){
        this.visitID = incrementNo;
        this.name = name;
        incrementNo++;
    }

    @Override
    public String toString() {
        return "PatientBill{" + "visitID=" + visitID + ", name=" + name + '}';
    }
    
    
    public int compareTo(Object obj){
        PatientBill otherBill = (PatientBill) obj;
        return name.compareTo(otherBill.name);
     
    }
    
    
    
}
