
package guia1;

import java.util.Scanner;


public class Ejercicio13 {

    public static void main(String[] args) {
        /* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta. */
        
        Scanner leer = new Scanner (System.in);
        
        int nota;
        
        do{
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
            
        }while(nota<0 || nota>10);
        
    }
    
}
