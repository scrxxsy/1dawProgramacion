package prPractica02;

import java.util.Scanner;

/**
 * Hacer un algoritmo para calcular el valor máximo y el valor mínimo de una lista de números que se
introducen por teclado, se terminará la operación cuando se introduzca el número 0, en este caso no
sabremos cuántos valores se van a introducir.
 */

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num;
	
		System.out.println("Introduzca números: ");
		
		while (true) {
			
			num=sc.nextInt();
			int max = num;
			int min = num;
			
			
			if(num==0) {
				break;
			}
			
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			
			System.out.println(min);
			System.out.println(max);
			
			
			sc.close();	
		}
		
		
	}

}