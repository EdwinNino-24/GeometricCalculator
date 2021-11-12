/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author Edwin Niño
 */
public class Rectangle extends GeometricSurfaces{
    
    private final double base;
    private final double height;

    public Rectangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return " RECTÁNGULO:" + super.toString() + 
                " \n Base--->" + base + 
                " \n Altura--->" + height;
    }
    
    @Override
    public double determineArea(){
        return base*height;
    }
    
    @Override
    public double determinePerimeter(){
        return (base*2)+(height*2);
    }
    
}
