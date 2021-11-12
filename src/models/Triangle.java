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
public class Triangle extends GeometricSurfaces{
    
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super(3);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public String toString() {
        return " TRIÁNGULO:" + super.toString() + 
                "\n Medida del Primer Lado--->" + firstSide + 
                "\n Medida del Segundo Lado--->" + secondSide + 
                "\n Medida del Tercer Lado--->" + thirdSide;
    }
    
    @Override
    public double determineArea(){
        double w = (firstSide+secondSide+thirdSide)/2;
        return Math.sqrt(w*(w-firstSide)*(w-secondSide)*(w-thirdSide));
    }
    
    @Override
    public double determinePerimeter(){
        return firstSide+secondSide+thirdSide;
    }
}
