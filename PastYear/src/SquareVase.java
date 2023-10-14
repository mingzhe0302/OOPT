/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class SquareVase extends Vase{
    
    private int width, length;
    
    public SquareVase(){
        
    }

    public SquareVase(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public SquareVase(String ID, String brand, double price, int height, int width, int length) {
        super(ID, brand, price, height);
        this.width = width;
        this.length = length;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n"
                + "width: " + width + "\n"
                + "length: " + length + "\n";
    }
}
