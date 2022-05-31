package Clases;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		 int edad,salario;
		
		System.out.println("Dime tu Nombre:");
			nombre = sc.nextLine();
			
		System.out.println("Dime tu edad:");
			edad = sc.nextInt();
			
			if (edad < 16) {
			    
			    System.out.println("No tienes edad para trabajar");
			} else if (edad > 19 && edad<=50) {
			   
			    System.out.println("tienes un 5% mas de salario");
			    System.out.println("Dime tu salario:");
				salario=sc.nextInt();
				cinco_porciento(salario);
			} else if (edad > 51 && edad<=60) {

			    System.out.println("tienes un 10% mas de salario");
			    System.out.println("Dime tu salario:");
				salario=sc.nextInt();
				diez_porciento(salario);
			} else if(edad>60) {
			    
			    System.out.println("tienes un 15% mas de salario");
			    System.out.println("Dime tu salario:");
				salario=sc.nextInt();
				quince_porciento(salario);
			}
			
		
			
			
		
	}
	
	public static void cinco_porciento (int salario) {
		
		double cinco= salario * 0.05;
		System.out.println("Su salario es:" + cinco);
		
		
	}
	
   public static void diez_porciento (int salario) {
		
		double diez= salario * 0.10;
		System.out.println("Su salario es:" + diez);
		
		
	}


public static void quince_porciento (int salario) {
	
	double quince= salario * 0.15;
	System.out.println("Su salario es:" + quince);
	
	
}
	
}
