package prPractica02;

import java.util.Locale;
import java.util.Scanner;

/*
 * Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, 
que son aquellos positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente 
el 0 no se considera un número casi cero.
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		float num;
		
		System.out.println("Introduzca el valor del número decimal: ");
		num=sc.nextFloat();
		
		if (num < 1 && num > -1 && num!=0) {
			System.out.println("El número " + num + " es un casi-cero");
			
		}
		else if (num==0) {
			System.out.println("El número " + num + " no es un casi-cero");
		}
		else {
			System.out.println("El número " + num + " no es un casi-cero");
		}
		
		sc.useLocale(Locale.US); 
		sc.close();

	}

}
