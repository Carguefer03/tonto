package Clases;

import java.util.Scanner;
//Pide 2 números y muestra cual es el mayor, el menor, o si son iguales
public class Ejercicio_4 {

	public static void main(String[] args) {
		
		//Escaneamos
		Scanner sc = new Scanner(System.in);
		
			// Pedimos el primer numero
		System.out.println("Introduzca un numero:");
				
		
		int numero= sc.nextInt();
		
		

		// Pedimos el otro numero
		System.out.println("Introduzca el otro numero:");
				
		
		int numero2= sc.nextInt();
		
		sc.close();
		
		//Metodo
		
		comprobaciones(numero,numero2);
		
	}
	
	public static void comprobaciones(int numero,int numero2) {
		
		//Mayor
		
		if(numero>numero2) {
			System.out.println(" Es Mayor ");
		}
		
		//Igual
		if (numero == numero2){
			System.out.println(" Son iguales ");
		}
		
		//Menor
		if (numero < numero2){
			System.out.println(" Es Menor ");
		}
	}

}
