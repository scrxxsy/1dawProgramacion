package prPractica02;

import java.util.Scanner;

/**
 * 10. Realizar un algoritmo para deducir el mayor de tres valores introducidos por teclado.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num1,num2,num3;
		
		System.out.println("Introduzca el primer número: ");
		num1=sc.nextInt();
		
		System.out.println("Introduzca el segundo número: ");
		num2=sc.nextInt();
		
		System.out.println("Introduzca el tercer número: ");
		num3=sc.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("El número " + num1 + " es mayor que " + num2 + " y " + num3 );
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("El número " + num2 + " es mayor que " + num1+ " y " + num3 );
		}
		else if (num3>num1 && num3>num2){
			System.out.println("El número " + num3 + " es mayor que " + num1+ " y " + num2 );	
		}
		
		
		sc.close();

	}

}
