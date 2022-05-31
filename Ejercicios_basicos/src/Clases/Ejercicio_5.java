package Clases;

import java.util.Scanner;

public class Ejercicio_5 {

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

			Suma(numero,numero2);
	}
	
	
	public static int Suma(int numero , int numero2) {
		
		int suma= numero + numero2;
		System.out.println("la suma de los dos numero es: " + suma);
		return suma;
	}

}
