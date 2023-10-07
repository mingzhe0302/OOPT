/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202112;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class PartTimeStudent extends Student{
    
    private String officeAddress;
    private String officeContact;

    

    public PartTimeStudent(String studentID, String studentName, String programme, int year, String contact, String homeAddress, String officeAddress, String officeContact) {
        super(studentID, studentName, programme, year, contact, homeAddress);
        this.officeAddress = officeAddress;
        this.officeContact = officeContact;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(String officeContact) {
        this.officeContact = officeContact;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "Office Address: " + officeAddress + "\n"
                + "Office Contact: " + officeContact + "\n";
                
    }
}
