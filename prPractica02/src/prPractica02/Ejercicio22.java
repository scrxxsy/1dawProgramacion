package prPractica02;

import java.util.Scanner;

/**
 * 22. Programa que calcula la media aritmética de una serie de números introducidos por teclado, que finaliza 
con la introducción del valor 0.
 */
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		float cont = -1;
		float total=0;
		
		do {
			System.out.println("Introduzca números(salir con el 0): ");
			num=sc.nextInt();
			cont++;
			total = total + num;
			
			
		}
		while(num!=0);
		
			System.out.println("\nTotal de datos introducidos: " + (int)cont);
			System.out.println("\nTotal de la suma de los números: " + (int)total);
			System.out.println("\nMedia aritmética: " + (float)(total/cont));
	
		sc.close();
	}

}
