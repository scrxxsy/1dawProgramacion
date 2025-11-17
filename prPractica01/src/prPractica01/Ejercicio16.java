package prPractica01;

import java.util.Scanner;

/**
 * Un programa tiene como entrada dos números y los almacena en las variables “u” y “v”. ¿Qué hay que
hacer par que al final del algoritmo los valores de las variables estén intercambiados? Diseña el
algoritmo correspondiente.
 */

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int u;
		int v;
		
		System.out.println("Introduzca el valor del primer número: ");
		u=sc.nextInt();
		
		System.out.println("Introduzca el valor del segundo  número: ");
		v=sc.nextInt();
		
		int intercambio=u;
		u=v;
		v=intercambio;
		
		System.out.println("Los valores intercambiados son "  + u + " y " + v );
		sc.close();
		
		
	}
}
