package prPractica02;

import java.util.Scanner;

/**
 * 6. Diseñar un algoritmo que nos permita saber el mayor de dos números introducidos. Controlar el caso de 
que sean iguales. 
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num1,num2;
		System.out.println("Introduzca el valor del primer número: ");
		num1=sc.nextInt();
		
		System.out.println("Introduzca el valor del segundo número: ");
		num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("El " + num1 + " es mayor al número " + num2);
		}
		else if(num2>num1) {
			System.out.println("El " + num2 + " es mayor al número " + num1);
		}
		else
			System.out.println("Son iguales");
		sc.close();
	}

}
