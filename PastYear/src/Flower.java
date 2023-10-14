/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Flower {
    
    private String ID;
    private String name;
    private String color;
    private double pricePerBouquet;
    private static int totalOfFlowersType;
    
    /*                                             constructors
    =================================================================================================== */
    
    public Flower(){
        
        totalOfFlowersType++;
    }

    public Flower(String ID, String name, String color, double pricePerBouquet) {
        this.ID = ID;
        this.name = name;
        this.color = color;
        this.pricePerBouquet = pricePerBouquet;
        
        totalOfFlowersType++;
    }
    
    /*                                             setters
    =================================================================================================== */

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPricePerBouquet(double pricePerBouquet) {
        this.pricePerBouquet = pricePerBouquet;
    }

    public static void setTotalOfFlowersType(int totalOfFlowersType) {
        Flower.totalOfFlowersType = totalOfFlowersType;
    }
    
    
    /*                                             getters
    =================================================================================================== */

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPricePerBouquet() {
        return pricePerBouquet;
    }

    public static int getTotalOfFlowersType() {
        return totalOfFlowersType;
    }
   
    
    
}
