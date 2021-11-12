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
public class Rhombus extends GeometricSurfaces{
    
    private final double side;
    private final double minorDiagonal;
    private final double majorDiagonal;

    public Rhombus(double side, double minorDiagonal, double majorDiagonal) {
        super(3);
        this.side = side;
        this.minorDiagonal = minorDiagonal;
        this.majorDiagonal = majorDiagonal;
    }

    public double getSide() {
        return side;
    }

    public double getMinorDiagonal() {
        return minorDiagonal;
    }

    public double getMajorDiagonal() {
        return majorDiagonal;
    }

    @Override
    public String toString() {
        return " ROMBO:" + super.toString() + 
                "\n Medida del Lado---> " + side + 
                "\n Diagonal Menor---> " + minorDiagonal + 
                "\n Diagonal Mayor---> " + majorDiagonal;
    }
    
    @Override
    public double determineArea(){
        return (minorDiagonal*majorDiagonal)/2;
    }
    
    @Override
    public double determinePerimeter(){
        return side*4;
    }
    
}
