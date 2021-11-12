/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.Scanner;
import models.Circle;
import models.GeometricSurfaces;
import models.Rectangle;
import models.Rhombus;
import models.Square;
import models.Trapeze;
import models.Triangle;

/**
 *
 * @author Edwin Niño
 */
public final class TestMain {
    
    static ArrayList<GeometricSurfaces> geometricSurfaces = new ArrayList<GeometricSurfaces>();
    private Scanner sc;
    
    public TestMain(){
        run();
    }
    
    public void run() {
        
        String banner =    "__________________________________________________________________________________________________\n" +
                               " ________________________________________________________________________________________________\n" +
                               "|                                      ______________________       [ManagerGeometricCalculator®]|\n" +
                               "|------------------------------------ | GEOMETRIC CALCULATOR | ----------------------------------|\n" +
                               "|________________________________________________________________________________________________|\n" +
                               "__________________________________________________________________________________________________";
        System.out.println(banner);
        int option = 0;
        
        do {
            
            String mainMenu =  " ________________________________________________________________________________________________\n" +
                               "|                                        ________________                                        |\n" +
                               "|-------------------------------------- | MENÚ PRINCIPAL | --------------------------------------|\n" +
                               "|________________________________________________________________________________________________|\n" +
                               
                               " ------------------------------------------------------------------------------------------------\n" +
                               "  Esta calculadora esta diseñada para hallar el área \n" +
                               "                                     y el perímetro de las siguientes superficies geométricas...   \n" +
                               " ------------------------------------------------------------------------------------------------\n" +
                               "|                              [--->] 1. Cuadrado------------->(1)                               |\n" +
                               "|                              [--->] 2. Triángulo------------>(2)                               |\n" +
                               "|                              [--->] 3. Rectángulo----------->(3)                               |\n" +
                               "|                              [--->] 4. Círculo-------------->(4)                               |\n" +
                               "|                              [--->] 5. Rombo---------------->(5)                               |\n" +
                               "|                              [--->] 6. Trapecio------------->(6)                               |\n" +
                               "|                              [--->] 7. Mostrar Historial---->(7)                               |\n" +
                               "|                              [--->] 8. Cerrar el programa--->(8)                               |\n" +
                               "|________________________________________________________________________________________________|";
            System.out.println(mainMenu);
            
            String formatOption = 
                               "__________________________________________________________________________________________________";
            String format1 =   " ________________________________________________________________________________________________ ";
            String format2 =   "|________________________________________________________________________________________________|";
            
            sc = new Scanner(System.in);
            
            try{
                System.out.println(formatOption);
                option = Integer.parseInt(sc.nextLine());
                System.out.println(formatOption);
            }
            catch(NumberFormatException x){ 
            }    
            
            switch(option) {
		case 1:
                    CalculateSquare();
                    break;
                case 2:
                    CalculateTriangle();
                    break;
                case 3:
                    CalculateRectangle();
                    break;
                case 4:
                    CalculateCircle();
                    break;
                case 5:
                    CalculateRhombus();
                    break;
                case 6:
                    CalculateTrapeze();
                    break;
                case 7:
                    ShowHistory();
                case 8:
                    System.out.println(formatOption);
                    System.out.println(" El programa se ha cerrado éxitosamente...");
                    System.out.println(formatOption);
                    break;
		default:
                    System.out.println(formatOption);
                    System.out.println(" Seleccione una opcion existente en el menú...");
                    System.out.println(formatOption);
                    break;
            }
        }while(option != 8);
    
    }
    
    public void CalculateSquare(){
        
        String formatOption = 
                               "__________________________________________________________________________________________________";
        try{
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida de un lado de la figura cuadrada...");
            System.out.println(formatOption);
            double side = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            Square square = new Square(side);
            geometricSurfaces.add(square);
            
            System.out.println(formatOption);
            System.out.println(" DATOS INGRESADOS: ");
            System.out.println(" Medida del Lado---> " + side);
            System.out.println();
            System.out.println(" RESULTADO: ");
            System.out.println(" Área--------> " + square.determineArea());
            System.out.println(" Perímetro---> " + square.determinePerimeter());
            
            System.out.println(formatOption);
            System.out.println("                     PRESIONE CUALQUIER TECLA PARA REGRESAR AL MENÚ PRINCIPAL                     ");
            System.out.println(formatOption);
            sc.nextLine(); 
        }
        catch(NumberFormatException x){
                
        }
        
    }
    
    public void CalculateTriangle(){
        
        String formatOption = 
                               "__________________________________________________________________________________________________";
        try{
            System.out.println(formatOption);
            System.out.println(" Ingrese las medidas de los tres lados de la figura triángular...");
            System.out.println(formatOption);
            double firstSide = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            double secondSide = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            double thirdSide = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            Triangle triangle = new Triangle(firstSide,secondSide,thirdSide);
            geometricSurfaces.add(triangle);
            
            System.out.println(formatOption);
            System.out.println(" DATOS INGRESADOS: ");
            System.out.println(" Medidas:");
            System.out.println(" Primer Lado----> " + firstSide);
            System.out.println(" Segundo Lado---> " + secondSide);
            System.out.println(" Tercer Lado----> " + thirdSide);
            System.out.println();
            System.out.println(" RESULTADO: ");
            System.out.println(" Área--------> " + triangle.determineArea());
            System.out.println(" Perímetro---> " + triangle.determinePerimeter());
            
            System.out.println(formatOption);
            System.out.println("                     PRESIONE CUALQUIER TECLA PARA REGRESAR AL MENÚ PRINCIPAL                     ");
            System.out.println(formatOption);
            sc.nextLine();
        }
        catch(NumberFormatException x){
                
        }
        
    }
    
    public void CalculateRectangle(){
        
        String formatOption = 
                               "__________________________________________________________________________________________________";
        try{
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida de la base de la figura rectangular...");
            System.out.println(formatOption);
            double base = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida de la altura de la figura rectangular...");
            System.out.println(formatOption);
            double height = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            Rectangle rectangle = new Rectangle(base, height);
            geometricSurfaces.add(rectangle);
            
            System.out.println(formatOption);
            System.out.println(" DATOS INGRESADOS: ");
            System.out.println(" Medida de la base-----> " + base);
            System.out.println(" Medida de la altura---> " + height);
            System.out.println();
            System.out.println(" RESULTADO: ");
            System.out.println(" Área--------> " + rectangle.determineArea());
            System.out.println(" Perímetro---> " + rectangle.determinePerimeter());
            
            System.out.println(formatOption);
            System.out.println("                     PRESIONE CUALQUIER TECLA PARA REGRESAR AL MENÚ PRINCIPAL                     ");
            System.out.println(formatOption);
            sc.nextLine(); 
        }
        catch(NumberFormatException x){
                
        }
        
    }
    
    public void CalculateCircle(){
        
        String formatOption = 
                               "__________________________________________________________________________________________________";
        try{
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida del radio de la figura circular...");
            System.out.println(formatOption);
            double ratio = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            Circle circle = new Circle(ratio);
            geometricSurfaces.add(circle);
            
            System.out.println(formatOption);
            System.out.println(" DATOS INGRESADOS: ");
            System.out.println(" Medida del Radio---> " + ratio);
            System.out.println();
            System.out.println(" RESULTADO: ");
            System.out.println(" Área--------> " + circle.determineArea());
            System.out.println(" Perímetro---> " + circle.determinePerimeter());
            
            System.out.println(formatOption);
            System.out.println("                     PRESIONE CUALQUIER TECLA PARA REGRESAR AL MENÚ PRINCIPAL                     ");
            System.out.println(formatOption);
            sc.nextLine();
        }
        catch(NumberFormatException x){
                
        }
    }
    
    public void CalculateRhombus(){
        
        String formatOption = 
                               "__________________________________________________________________________________________________";
        try{
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida de un lado de la figura romboide...");
            System.out.println(formatOption);
            double side = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida del diagonal menor de la figura romboide...");
            System.out.println(formatOption);
            double minorDiagonal = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida del diagonal mayor de la figura romboide...");
            System.out.println(formatOption);
            double majorDiagonal = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            Rhombus rhombus = new Rhombus(side,minorDiagonal,majorDiagonal);
            geometricSurfaces.add(rhombus);
            
            System.out.println(formatOption);
            System.out.println(" DATOS INGRESADOS: ");
            System.out.println(" Medida de un Lado---> " + side);
            System.out.println(" Medida del Diagonal Menor---> " + minorDiagonal);
            System.out.println(" Medida del Diagonal Mayor---> " + majorDiagonal);
            System.out.println();
            System.out.println(" RESULTADO: ");
            System.out.println(" Área--------> " + rhombus.determineArea());
            System.out.println(" Perímetro---> " + rhombus.determinePerimeter());
            
            System.out.println(formatOption);
            System.out.println("                     PRESIONE CUALQUIER TECLA PARA REGRESAR AL MENÚ PRINCIPAL                     ");
            System.out.println(formatOption);
            sc.nextLine();
        }
        catch(NumberFormatException x){
                
        }
    }
    
    public void CalculateTrapeze(){
        
        String formatOption = 
                               "__________________________________________________________________________________________________";
        try{
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida de un lado de la figura trapezoide...");
            System.out.println(formatOption);
            double side = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida de la base menor de la figura trapezoide...");
            System.out.println(formatOption);
            double minorBase = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida de la base mayor de la figura trapezoide...");
            System.out.println(formatOption);
            double majorBase = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            System.out.println(" Ingrese la medida de la altura de la figura trapezoide...");
            System.out.println(formatOption);
            double height = Integer.parseInt(sc.nextLine());
            System.out.println(formatOption);
            Trapeze trapeze = new Trapeze(side, minorBase, majorBase, height);
            geometricSurfaces.add(trapeze);
            
            System.out.println(formatOption);
            System.out.println(" DATOS INGRESADOS: ");
            System.out.println(" Medida de un Lado---> " + side);
            System.out.println(" Medida de la Base Menor---> " + minorBase);
            System.out.println(" Medida de la Base Mayor---> " + majorBase);
            System.out.println(" Medida de la Altura---> " + height);
            System.out.println();
            System.out.println(" RESULTADO: ");
            System.out.println(" Área--------> " + trapeze.determineArea());
            System.out.println(" Perímetro---> " + trapeze.determinePerimeter());
            
            System.out.println(formatOption);
            System.out.println("                     PRESIONE CUALQUIER TECLA PARA REGRESAR AL MENÚ PRINCIPAL                     ");
            System.out.println(formatOption);
            sc.nextLine();
        }
        catch(NumberFormatException x){
                
        }
    }
    
    public void ShowHistory(){
        
        String formatOption = "__________________________________________________________________________________________________";
        
        if(geometricSurfaces == null || geometricSurfaces.isEmpty()){
            System.out.println(" Aún no se tienen registros en el programa...");
          
        }
        else{
            
            for (GeometricSurfaces geometricSurface : geometricSurfaces) {
 
            System.out.println(geometricSurface.toString());
            System.out.println();
            System.out.println(" Área--------> " + geometricSurface.determineArea());
            System.out.println(" Perímetro---> " + geometricSurface.determinePerimeter());
            System.out.println();
            System.out.println();
            }
        }
        
        System.out.println(formatOption);
        System.out.println("                     PRESIONE CUALQUIER TECLA PARA REGRESAR AL MENÚ PRINCIPAL                     ");
        System.out.println(formatOption);
        sc.nextLine();
    }
    
    public static void main(String[] args) {
        
        TestMain testMain = new TestMain();
    }
    
}
