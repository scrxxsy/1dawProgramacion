package prPractica01;

import java.util.Scanner;

/**
 * 1.Hacer un programa que pida al usuario su edad, y muestre la edad 
 * que tendrá el próximo año.
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		byte edad;
		
		System.out.println("Introduzca su edad actual:");
		
		edad=sc.nextByte();
		
		System.out.println("Su edad el próximo año será " + (edad+1));
		
		sc.close();

	}

}
