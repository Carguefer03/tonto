package Clases;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sumapar=0,sumaimp=0,sumapos=0,sumaneg=0;
        int cantpos=0,cantneg=0,cantpar=0,cantimp=0;
        int numero,cantmed=0;
        float media=0;
        String respuesta, s, S;
        do {
            System.out.println ("Introduce numero");
            numero = sc.nextInt();
          
            media+=numero;
            
            
            cantmed++;
            
            
            if(numero<0) {
                System.out.println ("El numero es negativo");
                
                sumaneg+=numero;
                
                cantneg++;
            }
            else {
                System.out.println ("El numero es positivo");
                sumapos+=numero;
                cantpos++;
            }
            if(numero%2==0) {
                System.out.println ("El numero es e par");
                sumapar+=numero;
                cantpar++;
            }
            else {
                System.out.println ("El numero es impar");
                sumaimp+=numero;
                cantimp++;
            }	
            
            System.out.println ("Quiere intoducir otro numero?");
            
            respuesta=sc.next();
            
        }while(respuesta.equals("s") || respuesta.equals("S"));
        
        
        media=media/cantmed;
        
        System.out.println ("La suma de los negativos es "+sumaneg);
        
        System.out.println ("La suma de los positivos es "+sumapos);
        
        System.out.println ("La suma de los pares es "+sumapar);
        
        System.out.println ("La suma de los impares es "+sumaimp);
        
        System.out.println ("La cantidad de negativos es "+cantneg);
        
        System.out.println ("La cantidad de positivos es "+cantpos);
        
        System.out.println ("La cantidad de pares es "+cantpar);
        
        System.out.println ("La cantidad de impares es "+cantimp);
        
        System.out.println ("La media de todos los numeros es "+media);	
        
    }

	}

}
