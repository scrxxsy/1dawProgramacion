package prPractica02;

import java.util.Scanner;

/**
 * Hacer un algoritmo para calcular de forma automática las n primeras potencias de un número A. Se
introducen por teclado los números n (exponente) y A (base).
 */

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num, potencia;
		
		System.out.println("Introduzca el número: ");
		num=sc.nextInt();
		
		System.out.println("Introduzca a cuanto quieres elevarlo: ");
		potencia=sc.nextInt();
		
		for (int cont=0; cont<=potencia; cont++) {
			System.out.println(num + " elevado a " + cont + " es " + (int)Math.pow(num, cont));
		}
		
		sc.close();

	}

}
