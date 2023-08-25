/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class InpatientBill extends PatientBill {
    
    private static double standardRate = 100.0;
    private static double privateRate = 200.0;
    private double specialistCharges;
    private double labCharges;
    private char roomType;
    private int durationOfStay;

    public InpatientBill( String name, double specialistCharges, double labCharges, char roomType, int durationOfStay) {
        super(name);
        this.specialistCharges = specialistCharges;
        this.labCharges = labCharges;
        this.roomType = roomType;
        this.durationOfStay = durationOfStay;
    }
    
    public double calTotalCharges(){
        double roomRate  = 0.0;
        
        if(roomType == 'S'){
            roomRate = standardRate * durationOfStay;    
        }
        else if(roomType == 'P'){
            roomRate = privateRate * durationOfStay;
        
        }
        
        return specialistCharges + labCharges + roomRate;
    }

    @Override
    public String toString() {
        return super.toString() + "InpatientBill{" + "specialistCharges=" + specialistCharges + ", labCharges=" + labCharges + ", roomType=" + roomType + ", durationOfStay=" + durationOfStay + '}';
    }
    
    
}
