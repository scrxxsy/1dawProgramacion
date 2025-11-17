package prPractica01;

import java.util.Scanner;

/**
 * - Diseñar un algoritmo que a partir de la base y la altura de un triángulo muestre como resultado su
superficie. (superficie = b · h / 2).

 */

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		float base;
		float altura;
		
		System.out.println("Introduzca el valor de la base del triángulo: ");
		base=sc.nextFloat();
		
		System.out.println("Introduzca el valor de la altura del triángulo: ");
		altura=sc.nextFloat();
		
		float superficie = (base*altura)/2;
		
		System.out.println("EL valor de la superficio del triángulo es: " + superficie );
		
		sc.close();

	}

}
