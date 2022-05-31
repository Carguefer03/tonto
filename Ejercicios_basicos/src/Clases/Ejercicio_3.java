package Clases;

import java.util.Scanner;

//Pide un número y muestra si es positivo o negativo y si es par o impar
public class Ejercicio_3 {

	public static void main(String[] args) {
		
		// Pedimos el numero
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero:");
		
		int numero= sc.nextInt();
		sc.close();
		// Llamada al metodo
		
		Comprobacion(numero);
		
		Par_Impar(numero);
	}
	
	// Comprobacion Negativo o Positivo
	
	public static void Comprobacion (int numero) {
		
		if(numero<0)
			System.out.println("el numero es negativo");
		
		else 
		System.out.println("el numero es positivo");
		
	} 
	
	// Comprobacion Par o Impar
	
	public static boolean Par_Impar (int numero) {
		
		if(numero%2==0) {
			System.out.println("Es par");
			return true;
		}else {
			System.out.println("Es impar");
			return false;
		}
			
			
		
		
	}
	
		

}
