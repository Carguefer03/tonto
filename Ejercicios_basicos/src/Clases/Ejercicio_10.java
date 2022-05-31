package Clases;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	    String usu1, usu2; 
		 
        System.out.println("USUARIO 1 : (P)Piedra, Papel(L), (T)Tijera:");
        usu1 = sc.next();
        System.out.println("USUARIO 2 : (P)Piedra, Papel(L), (T)Tijera:");
        usu2 = sc.next();
        
      	     
		if(usu1.equals("P") && usu2.equals("P"))
			System.out.println("Empate");
		if(usu1.equals("L") && usu2.equals("L"))
			System.out.println("Empate");
		if(usu1.equals("T") && usu2.equals("T"))
			System.out.println("Empate");
		if(usu1.equals("P") && usu2.equals("T"))
			System.out.println("Gana usuario 1");
		if(usu1.equals("P") && usu2.equals("L"))
			System.out.println("Gana usuario 2");
		if(usu1.equals("T") && usu2.equals("L"))
			System.out.println("Gana usuario 1");
		if(usu1.equals("T") && usu2.equals("P"))
			System.out.println("Gana usuario 2");
		if(usu1.equals("L") && usu2.equals("P"))
			System.out.println("Gana usuario 1");
		if(usu1.equals("L") && usu2.equals("T"))
			System.out.println("Gana usuario 2");
        

	}

}
