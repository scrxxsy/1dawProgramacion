package prPractica02;

import java.util.Scanner;

/**
 * Programa que calcule el producto de dos números enteros positivos mediante sumas sucesivas, no 
podéis utilizar la operación de multiplicación.
 */
public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner (System.in);
		int num1, num2;
		int total=0;
		
		
		System.out.println("Introduzca el valor del primer número: ");
		num1=sc.nextInt();
		
		
		System.out.println("Introduzca el valor del segundo número: ");
		num2=sc.nextInt();
		
		
		
		for (int cont = 1; cont<=num2; cont++) {
			total = num1 + total;
		}
		System.out.println("El resultado de la multiplicación es: " + total);
		sc.close();
	}

}
