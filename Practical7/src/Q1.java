/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Q1 {

    public static void main(String[] args) {
        PatientBill[] bills = new PatientBill[4];

        bills[0] = new OutpatientBill("Tan Jeeschuan", 30.0);
        bills[1] = new OutpatientBill("May", 50.0);
        bills[2] = new InpatientBill("Tom", 50.0, 30.0, 'S', 5);
        bills[3] = new InpatientBill("AIi", 40.0, 30.0, 'P', 6);

        for (PatientBill bill : bills) {

            System.out.println(bill);
            System.out.println("Total Charges: " + bill.calTotalCharges());
        }

        System.out.println("\nTotal Charges of patients: " + computeTotalCharges(bills));
    }

    public static double computeTotalCharges(PatientBill[] bills) {
        double total = 0.0;

        for (PatientBill bill : bills) {
            total += bill.calTotalCharges();
        }

        return total;
    }
}
