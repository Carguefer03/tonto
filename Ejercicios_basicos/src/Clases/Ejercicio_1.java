package Clases;

import java.util.Scanner;
// Calcula el factorial de un número pedido por teclado

public class Ejercicio_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("dime un numero: ");
		
		int num=sc.nextInt();
		sc.close();
		
		int resultado= factorial(num);
		
		System.out.println(resultado);
	}
	// 4*3*2*1
	public static int factorial(int num) {
		
		if (num==0) {
			return 1;
			
		} else{
			
			return num*factorial(num-1);
		}
	}

}
