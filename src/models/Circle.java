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
public class Circle extends GeometricSurfaces {
    
    private final double ratio;

    public Circle(double ratio) {
        super(1);
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    @Override
    public String toString() {
        return " CIRCULO:" + super.toString() + "\n Radio---> " + ratio + "\n Diametro---> " + ratio*2;
    }
    
    @Override
    public double determineArea(){
        return Math.PI*Math.pow(ratio, 2);
    }
    
    @Override
    public double determinePerimeter(){
        return Math.PI*ratio*2;
    }
    
}
