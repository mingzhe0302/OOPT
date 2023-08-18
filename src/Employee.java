/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Employee {

    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee [name:" + name + ", yearJoined= " + yearJoined + ",basicSalary= " + basicSalary + "]";

    }

    public double calculateSalary() {

        return basicSalary;
    }

    //3(c)
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        
        if (obj == null || getClass() != obj.getClass()) 
            return false;

        Employee employee = (Employee) obj;
        return name.equals(employee.name);

    }
}
