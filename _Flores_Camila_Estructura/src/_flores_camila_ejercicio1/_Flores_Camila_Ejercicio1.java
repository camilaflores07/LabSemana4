/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _flores_camila_ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 50494
 */
public class _Flores_Camila_Ejercicio1 {

   
    public static void main(String[] args) {
        int numerosA,NumeroP, Primos, PrimosA, opcion;
        String PalabrasA, Palabras; 
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Favor seleccione una de las siguientes:\n"
        +"1. Palabra Alreves\n"
        +"2. Numero Perfecto\n"
        +"3. Primos\n"
        +"4. Votaciones\n"
        +"5. Salir");
        opcion = entrada.nextInt();
        
        while (opcion != 5){
            switch (opcion){
                case 1: System.out.println("Ingrese la palabra que quiere revertir: ");
                PalabrasA = entrada.next();
                for (int i = PalabrasA.length()-1; i >= 0; i--) {
                    System.out.print(PalabrasA.charAt(i));  
                    }
                    System.out.println("  ");
                    break;
            
            
            }
        
        }
        
   
    }
   
            

    
    }
     
}
    

