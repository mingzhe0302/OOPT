/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class OutpatientBill extends PatientBill{
    private static double RegistrationFee = 30.0;
    private double consultationFee;
    
    public OutpatientBill(String name, double consultationFee){
        super(name);
        this.consultationFee = consultationFee;
    }
    
    public double calTotalCharges(){
        return consultationFee + RegistrationFee;
    }

    @Override
    public String toString() {
        return super.toString() + "OutpatientBill{" + "consultationFee=" + consultationFee + '}';
    }
    
    
}
