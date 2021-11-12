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
public class Square extends GeometricSurfaces {
    
    private final double side;

    public Square(double side) {
        super(1);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return " CUADRADO:" + super.toString() + "\n Medida del Lado---> " + side;
    }
    
    @Override
    public double determineArea(){
        return Math.pow(side, 2);
    }
    
    @Override
    public double determinePerimeter(){
        return side*4;
    }
    
}
