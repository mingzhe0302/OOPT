/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ202009;

/**
 *
 * @author Yeoh Ming Zhe
 */
public class ForeCast implements Weather{
    
    @Override
    public void Sunny(){
        System.out.println("Remember to apply lotion");
    }
    
    @Override
    public void Rainy(){
        System.out.println("Remember to bring umbrella");
    }
}
