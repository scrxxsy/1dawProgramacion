package prPractica01;

import java.util.Scanner;

/**
 * 5.-  Realizar un programa para calcular el valor de la hipotenusa de 
 * un triángulo rectángulo aplicando el teorema de Pitágoras. 
 * Se pedirán por teclado los dos catetos, y se mostrará por pantalla el resultado 
de calcular la hipotenusa.
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cat1, cat2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el valor del cateto 1: ");
		cat1=sc.nextDouble();
		
		
		System.out.println("Introduzca el valor del cateto 2: ");
		cat2=sc.nextDouble();
			  
		double hip = Math.sqrt(cat1 + cat2);
		
		System.out.println("La hipotenusa tiene un valor de " + hip);
		
		sc.close();
		}	
	
	}


	
