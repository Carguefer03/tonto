package Clases;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        int num;
	        int supar=0;
	        int suimpar=0;
	        System.out.println ("Introduce numero:");
	        num = teclado.nextInt();
	        for(int i=1;i<=num;i++) {
	            if(i%2==0) {
	                supar+=i;
	            }
	            else {
	                suimpar+=i;
	            } 
	        }
	        System.out.println ("La suma de los pares es "+supar);
	        System.out.println ("La suma de los impares es "+suimpar);
	    } 
	

	}


