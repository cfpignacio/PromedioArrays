/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioarrays;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class PromedioArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cantidad,promedioSuma;
        Scanner leer = new Scanner(System.in); 
        promedioSuma = 0;
        
        System.out.println("Ingrese la cantidad de notas: ");
        cantidad = leer.nextInt();
        
        int[] miArray = new int[cantidad];
        
        
        for(int i: miArray ){
            
            System.out.println("Ingrese una nota: ");
            promedioSuma = promedioSuma + leer.nextInt();
            
         }
        System.out.println("Cantidad de notas = " + cantidad);

        System.out.println("Promedio -> "+promedioSuma/cantidad);
    }
    
}
