package prPractica02;

import java.util.Scanner;

/**
 * 21. Programa que imprima la tabla de multiplicar de un número entero (entre 1 y 10). 
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int tabla;
		
		
		System.out.println("Introduzca la tabla a realizar: ");
		tabla=sc.nextInt();
		if(tabla>10 || tabla<1) {
		System.out.println("ERROR");
		}
		else {
		System.out.println("TABLA DEL " + tabla);
		for(int cont=0; cont<=10; cont++) {
			System.out.println(tabla + " por " + cont + " = " + tabla*cont);
		}

		
		
		sc.close();
		
	}

	}
}
