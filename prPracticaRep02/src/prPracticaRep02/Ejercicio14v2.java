package prPracticaRep02;

import java.util.Scanner;

/**
 *  Escribir un programa que lea las temperaturas de 15 observatorios meteorológicos y escriba la
temperatura mínima y la temperatura máxima que se han producido.

 */

public class Ejercicio14v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int temperatura, contObs=1, max, min;
		final int OBSERVATORIOS = 15;
		
		System.out.println("Observatorio 1: " + contObs);
		System.out.println("Introduzca la temp máxima: ");
		max=sc.nextInt();
		System.out.println("Introduzca la temp máxima: ");
		min=sc.nextInt();
		
		while(contObs<OBSERVATORIOS) {
			contObs++;
			
			System.out.println("Observatorio " + contObs);
			System.out.println("Introduzca la temp máxima: ");
			max=sc.nextInt();
			System.out.println("Introduzca la temp máxima: ");
			min=sc.nextInt();
		}
		
		
		sc.close();
		

	}

}
