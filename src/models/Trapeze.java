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
public class Trapeze extends GeometricSurfaces{
    
    private final double side;
    private final double minorBase;
    private final double majorBase;
    private final double height;

    public Trapeze(double side, double minorBase, double majorBase, double height) {
        super(4);
        this.side = side;
        this.minorBase = minorBase;
        this.majorBase = majorBase;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public double getMinorBase() {
        return minorBase;
    }

    public double getMajorBase() {
        return majorBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return " TRAPECIO:" + super.toString() +
                "\n Medida del Lado---> " + side + 
                "\n Base Menor---> " + minorBase + 
                "\n Base Mayor---> " + majorBase + 
                "\n Altura---> " + height;
    }
    
    @Override
    public double determineArea(){
        return ((minorBase*majorBase)*height)/2;
    }
    
    @Override
    public double determinePerimeter(){
        return side*4;
    }
    
}
