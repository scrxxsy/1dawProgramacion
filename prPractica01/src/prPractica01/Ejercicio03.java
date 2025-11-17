package prPractica01;

import java.util.Scanner;

public class Ejercicio03 {
	
	/**
	 * 3.-  Realizar un programa que calcule la media aritmética de tres valores 
	 * que se han leído de teclado, y 
muestre el resultado por pantalla. 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
Scanner sc = new Scanner (System.in);
		
		float num1;
		float num2;
		float num3;
		
		
		System.out.println("Introduzca el primer número: ");
		
		num1=sc.nextByte();
		
		System.out.println("Introduzca el segundo número: ");
		
		num2=sc.nextByte();
		
		System.out.println("Introduzca el tercer número: ");
		
		num3=sc.nextByte();
		
		System.out.println("La media aritmética es " +  ((num1 + num2 + num3)/3));
		
		sc.close();

	}

}

