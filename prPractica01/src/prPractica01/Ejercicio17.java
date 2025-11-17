package prPractica01;

import java.util.Scanner;

/**
 * - Escribir un programa que reciba 4 números naturales a, b, c y d y que calcule 
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.println("Introduzca el valor a: ");
		a=sc.nextInt();
		
		System.out.println("Introduzca el valor b: ");
		b=sc.nextInt();
		
		System.out.println("Introduzca el valor c: ");
		c=sc.nextInt();
		
		System.out.println("Introduzca el valor d: ");
		d=sc.nextInt();
		
		double total = (Math.pow(a, b) + Math.pow(c, d)) * (Math.pow(a,c) + Math.pow(b, d));
		
		System.out.println("El total es " + total);
		
		sc.close();

	}

}
