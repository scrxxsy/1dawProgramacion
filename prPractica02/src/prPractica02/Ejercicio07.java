package prPractica02;

import java.util.Scanner;

/**
 *  Hacer un algoritmo para ver si un número introducido por teclado es par o impar.
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Introduzca el número: ");
		num=sc.nextInt();
		
		if (num%2==0) {
			System.out.println(num + " es par");
		}
		else {
			System.out.println(num + " es impar");
		}
		sc.close();
	}

}
