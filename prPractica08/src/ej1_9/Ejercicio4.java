package ej1_9;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 4.- Escribe un programa que lea 8 números por teclado y que luego los muestre en orden inverso, es decir, 
		el primero que se introduce es el último en mostrarse y viceversa. 
		 */
		
		int [] array = new int [8];
		
		Scanner sc = new Scanner (System.in);
		
		for (int i=0; i<array.length; i++) {
			System.out.print("Introduzca números: ");
			array[i] = sc.nextInt();
			
			
		}
		
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
			
			
		
			
		}
		System.out.println();
		for (int a=array.length-1; a>=0; a--) {
			System.out.print(array[a]+ " ");
		}
	
		
	
		
		sc.close();
		

	}

}
