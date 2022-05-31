package Clases;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    int array[]=new int [5];

	    int suma=0;
	    
	    for(int i=0; i<array.length; i++)
	    {
	        System.out.printf("Introduzca número %d: ", i+1);
	        array[i] = sc.nextInt();
	        
	    }

	    for( int i=0; i<array.length; i++)
	    {
	        System.out.println(array[i]);
	        
	       
	    }
	    
	    for( int i=0; i<array.length; i++)
	    {
	        
	        suma+=array[i];
	       
	    }
	    
	    System.out.println("La suma de los array es = "+suma);
	    
	    System.out.println("");
	
	    System.out.println("Los numeros inversos son:");
		int j =4;
		while(j>=0) {
			System.out.println(array[j]+"");
			j--;
		}
	}


}
