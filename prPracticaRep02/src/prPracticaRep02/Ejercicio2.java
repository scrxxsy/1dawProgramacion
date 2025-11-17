package prPracticaRep02;

import java.util.Scanner;

/**
 * 2. Diseñar un programa para determinar si un número entero es múltiplo de 3, 4 o 5
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Introduzca el valor del número: ");
			num=sc.nextInt();
			
		}
		
		if(num%3==0) {
			System.out.println("Múltiplo de 3");
		}
		else if(num%4==0) {
			System.out.println("Múltiplo de 4");
		}
		else if(num%5==0) {
			System.out.println("Múltiplo de 5");
		}
		else
			System.out.println("No es múltiplo ni de 3, 4 y 5");
	}

}
