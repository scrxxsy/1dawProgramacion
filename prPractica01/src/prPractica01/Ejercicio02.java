package prPractica01;

import java.util.Scanner;

/**
 * 2.-  Escribir un programa que pida el año actual y el de nacimiento 
 * del usuario. Debe calcular su edad, 
suponiendo que en el año en curso el usuario ya ha cumplido años.
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner (System.in);
		
		int anioactual;
		int aniodenacimiento;
		
		System.out.println("Introduzca el año actual: ");
		
		anioactual=sc.nextInt();
		
		System.out.println("Introduzca el año de nacimiento: ");
		
		aniodenacimiento=sc.nextInt();
		
		System.out.println("Su edad suponiendo que has cumplido ya años es: " + (anioactual-aniodenacimiento));
		
		sc.close();

	}

}
