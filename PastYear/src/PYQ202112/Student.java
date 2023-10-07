/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202112;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Student {
    
    protected String studentID;
    protected String studentName;
    protected String programme;
    protected int year;
    protected String contact;
    protected String homeAddress;
    
    protected Student(){
        
    }

    public Student(String studentID, String studentName, String programme, int year, String contact, String homeAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.programme = programme;
        this.year = year;
        this.contact = contact;
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + "\n"
                + "Student Name: " + studentName + "\n"
                + "Programme: " + programme + "\n"
                + "Year: " + year + "\n"
                + "contact: " + contact + "\n"
                + "Home Address: " + homeAddress + "\n";
    }
    
    
            
}
