package prPractica02;

import java.util.Scanner;
/**
 * 4. Realizar un algoritmo que permita saber si un número es mayor, menor o igual a cero.
 */

public class Ejercicio04 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		System.out.println("Introduzca el número: ");
		num=sc.nextInt();
		
		if (num>0) {
			System.out.println(num + " Es mayor a 0");
		}
		else if (num < 0) {
			System.out.println(num + " Es menor a 0");
		}
		else 
			System.out.println("Es cero");
		
		sc.close();
	}

}
