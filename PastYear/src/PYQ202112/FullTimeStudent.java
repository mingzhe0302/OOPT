/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202112;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class FullTimeStudent extends Student{
    
    private String parentContact;

    public FullTimeStudent(String studentID, String studentName, String programme, int year, String contact, String homeAddress, String parentContact) {
        super(studentID, studentName, programme, year, contact, homeAddress);
        this.parentContact = parentContact;
    }

    public String getParentContact() {
        return parentContact;
    }

    public void setParentContact(String parentContact) {
        this.parentContact = parentContact;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Parent Contact: " + parentContact + "\n";
    }
    
    
}
