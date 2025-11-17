package prPractica02;

import java.util.Scanner;

/**
 * 1. Realizar un programa para calcular el valor máximo y el mínimo de una lista de n números que se
introducen por teclado, es decir, me indicarán cuántos valores se van a introducir, y se pedirán por
teclado los que nos hayan indicado.
 */

public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("¿Cuántos números desea introducir?: ");
		n=sc.nextInt();
		
		int num;
		
		System.out.println("Introduzca el valor 1: ");
		num=sc.nextInt();
		
		int max = num;
		int min = num;
		
		for (int cont = 2; cont<= n; cont++) {
			System.out.println("Introduce el número " + cont + " :");
			num=sc.nextInt();
		
		if (num>max) {
			max=num;
		}
		if (num<min) {
			min=num;
		}
		}
		System.out.println("El número más grande es: " + max);
		System.out.println("El número más pequeño es: " + min);
		
		
		sc.close();

	}

}
