package ej1_9;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. Hacer un programa que lea del teclado 10 números enteros y los almacene en un vector. 
		 * Utilizando
este vector, visualizar y sumar los elementos que ocupan las posiciones pares.

		 */
		
		int array [] = new int [10];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<array.length; i++) {
			System.out.println("Introduzca el número: ");
			array[i] = sc.nextInt();
		}
			
		System.out.println("\n\nElementos posiciones pares: ");
		for (int i = 0; i<array.length; i++) {
			if(i%2!=0) {
				System.out.println(array[i] + " ");
				sum += array[i];
			}
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
