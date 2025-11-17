package prPractica01;

import java.util.Scanner;

/**
 * - Escribir un programa que convierta un número dado en segundos en el equivalente de minutos y
horas. 
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int segundos;
		
		System.out.println("Introduzca la cantidad de segundos para convertirla en minutos y segundos: ");
		segundos=sc.nextShort();
		
		int segundosaminutos= (segundos/60);
		int seg = (segundos%60);
		
		System.out.println("\nLos " + segundos + " segundos equivalen a " + segundosaminutos + " minutos y " +
		seg + " segundos");

		
		sc.close();

	}

}
