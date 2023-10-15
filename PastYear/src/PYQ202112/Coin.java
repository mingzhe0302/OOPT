/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202112;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Coin implements Circle{
    
    private double radius;
    
    @Override
    public double calculatePerimeter(){
        double perimeter = 2 * PI * radius;
        return perimeter;
    }
    
    @Override
    public double calculateArea(){
        double area = PI * radius * radius;
        return area;
    }
}
