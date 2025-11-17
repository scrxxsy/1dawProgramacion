package prPractica02;

import java.util.Scanner;

/**
 * . Hacer un algoritmo que nos sume, los números naturales que sean pares, y menores que un número
introducido por teclado.
 */

public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numax;
		int suma = 0;
		
		System.out.println("Introduzca el valor máximo: ");
		numax=sc.nextInt();
		
		
		for (int cont = 0; cont < numax; cont++) {
			if(cont%2==0) {
				suma = suma + cont;
			}
		}
		System.out.println(suma);
		sc.close();
	}

}
