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
public abstract class GeometricSurfaces {
    
    protected int numberOfMeasures;

    public GeometricSurfaces(int numberOfMeasures) {
        this.numberOfMeasures = numberOfMeasures;
    }

    public int getNumberOfMeasures() {
        return numberOfMeasures;
    }

    @Override
    public String toString() {
        return "\n SUPERFICIES GEOMÉTRICAS [" + " Cantidad de Dimensiones Ingresadas---> " + numberOfMeasures + " ]";
    }
    
    public abstract double determineArea();
    
    public abstract double determinePerimeter();
    
}
