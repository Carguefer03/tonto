package Clases;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
           int numero = sc.nextInt();

 boolean resultado= esPrimo(numero);
            
 
 if(resultado) {
	 System.out.println("es primo");
	 
 } else {
	 System.out.println("no es primo");
 }
   String pregunta;      
 System.out.print("¿Desea continuar? ");
  System.out.println("S / N ");
   pregunta = sc.next();
 
 
 do {
	 
	 System.out.print("Introduce un numero: ");
             numero = sc.nextInt();

   resultado= esPrimo(numero);
             
  
  if(resultado) {
 	 System.out.println("es primo");
 	 
  } else {
 	 System.out.println("no es primo");
  }
  
  
 		  System.out.print("¿Desea continuar? ");
 	        System.out.println("S / N ");
 	         pregunta = sc.next();
 	        
 	        
	 
 } while(pregunta.equals("s") || pregunta.equals("S"));
           
        
	}
	
	static boolean esPrimo(int numero) {
		for (int div = 2; div < numero; div++) {
			if (numero % div == 0) {
				return false;
			}
		}
return true;
}
	
	
	
	
}
