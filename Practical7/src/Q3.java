/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Q3 {

    public static void main(String[] args) {

        ComparableCircle a = new ComparableCircle(4.00);
        ComparableCircle b = new ComparableCircle(4.00);
        
        if(a.compareTo(b) > 0){
             System.out.println("Circle a is larger.");
        }else if(a.compareTo(b) < 0){
            System.out.println("Circle b is larger");
        }else 
            System.out.println("Both of them hava a same size");
        
        a.howToColor();
        b.howToColor();
    }

}

class Circle {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {

        return radius;
    }
}

class ComparableCircle extends Circle implements Colorable, Comparable {

    ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public void howToColor() {
        System.out.println("Color the circle by filling it with your favourite colors");
    }

    @Override
    public int compareTo(Object obj) {
        Circle c = (Circle) obj;

        if (this.getRadius() > c.getRadius()) {
            return 1;
        } else if (this.getRadius() < c.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}

interface Colorable {

    public void howToColor();
}

interface Comparable {

    public int compareTo(Object obj);
}
