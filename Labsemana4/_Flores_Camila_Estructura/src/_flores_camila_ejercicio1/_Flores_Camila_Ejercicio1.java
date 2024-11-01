/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _flores_camila_ejercicio1;



import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class _Flores_Camila_Ejercicio1 {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static void main(String[] args) {
        int numerosA,NumeroP, Primos, PrimosA, opcion=0;
        String PalabrasA, Palabras; 
        int Naleatorio;
        boolean NoEsPrimo, EsPrimo;
        
        int  ejercicio1=0;
        int  ejercicio2=0;
        int  ejercicio3=0;
        int  ejercicio4=0;         
       
  
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
       
        
        while (opcion != 5){ 
             System.out.println("Favor seleccione una de las siguientes:\n"
        +"1. Palabra Alreves\n"
        +"2. Numero Perfecto\n"
        +"3. Primos\n"
        +"4. Votaciones\n"
        +"5. Salir");
        opcion = entrada.nextInt();
        ////menu principal, cada vez que el programa termine se devuelve a menu.
        
            switch (opcion){
                case 1 -> { 
                    System.out.println("Ingrese la palabra que quiere revertir: ");
                    PalabrasA = entrada.next();
                    for (int i = PalabrasA.length()-1; i >= 0; i--) {
                        System.out.print(PalabrasA.charAt(i));
                    }
                    System.out.println("  ");
                    ejercicio1++;
                    break;
                }
                    
                case 2 -> {
                    System.out.println("Ingrese un numero: ");
                    NumeroP = entrada.nextInt();
                    ejercicio2++;
                    break;
                }
                    
                case 3 -> {
                    ejercicio3++;
                    break;
                    ///numero random 
                }
                
                case 4 -> { 
                    System.out.print("Ingrese la cantidad de votantes en el país: ");
                    int cVotantes = entrada.nextInt();

                    int votoAzul = 0;
                    int votoRojo = 0;
                    int votoNegro = 0;
                    int votoAmarillo = 0;
                    int votoNulos = 0;
                    ///validacion 

                    for (int i = 0; i < cVotantes; i++) {
                        System.out.print("Porfavor ingrese su voto (AZUL, ROJO, NEGRO, AMARILLO): ");
                        String voto = entrada.next().toUpperCase();

                        switch (voto) {
                            case "AZUL":
                                votoAzul++;
                                break;
                            case "ROJO":
                                votoRojo++;
                                break;
                            case "NEGRO":
                                votoNegro++;
                                break;
                            case "AMARILLO":
                                votoAmarillo++;
                                break;
                            default:
                                votoNulos++;
                                break;
                                ////casos de color de votos
                        }
                    }

                    int votosValidos = votoAzul + votoRojo + votoNegro + votoAmarillo;
                    double pVotosValidos = (votosValidos * 100.0) / cVotantes;

                    if (pVotosValidos >= 60) {
                        String ganador;
                        if (votoAzul > votoRojo && votoAzul > votoNegro && votoAzul > votoAmarillo) {
                            ganador = ANSI_BLUE + "AZUL";
                        } else if (votoRojo > votoAzul && votoRojo > votoNegro && votoRojo > votoAmarillo) {
                            ganador = ANSI_RED + "ROJO";
                        } else if (votoNegro > votoAzul && votoNegro > votoRojo && votoNegro > votoAmarillo) {
                            ganador = ANSI_BLACK + "NEGRO";
                        } else {
                            ganador = ANSI_YELLOW + "AMARILLO";
                            ///// diferentes escenarios para ver que planilla 
                        }
                        System.out.println("Los ganadores son los: " + ganador + " felicidades equipo ganador!");
                    } else {
                        System.out.println("votacion nula,lo que ingreso no es valido");
                        ejercicio4++;
                        break;
                    }
                    
                }
                    
                case 5 -> 
                    System.out.println("saliendo...muchas gracias ");
                    System.out.println("Las veces que uso el ejercicio 1 fueron "+ejercicio1);
                    System.out.println("Las veces que uso el ejercicio 2 fueron "+ejercicio2);
                    System.out.println("Las veces que uso el ejercicio 3 fueron "+ejercicio3);
                    System.out.println("Las veces que uso el ejercicio 4 fueron "+ejercicio4);
                    //intento de contador pero sale error.

                
                
                
                default -> {
                    System.out.println("Opción no válida, porfavor Intente de nuevo.");
                    break;
                    
                    
                  
                   
                        
                        
                        
                    }
                }
                
                    
                }       
            }
        
        }
        
   
    
   
            

    
    }
     
}
    

