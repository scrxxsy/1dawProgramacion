package prPractica01;

import java.util.Scanner;

/**
 *  Realizar un programa que realiza y muestra las operaciones aritméticas básicas de dos números
pasados a nuestro programa. Las operaciones aritméticas básicas son, suma, resta, multiplicación y
división.
 */

public class Ejercicio14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float num1, num2;
		
		System.out.println("Introduzca el valor del primer número: ");
		num1=sc.nextFloat();
		
		System.out.println("Introduzca el valor del segundo número: ");
		num2=sc.nextFloat();
		
		float suma = num1 + num2;
		float resta = num1 - num2;
		float multiplicacion = num1 * num2;
		float division = num1/num2;
		
		System.out.println("\nLa suma daría: " + suma +
				"\nLa resta daría: " + resta +
				"\nLa multiplicación daría: " + multiplicacion +
				"\nLa división daría: " + division
													);
		
		
		
		sc.close();
		
	}

}
