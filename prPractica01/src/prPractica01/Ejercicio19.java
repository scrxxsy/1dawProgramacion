package prPractica01;

import java.util.Scanner;

/**
 * Convertir un tiempo expresado en segundos a un formato que lo represente a horas, minutos y 
segundos.
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int seg;
		
		System.out.println("Introduzca la cantidad de segundos a convertir: ");
		seg=sc.nextInt();
		
		int hora = (seg/3600);
		int minutos = (seg/60);
		int segundos = (seg%60);
		
		System.out.println("Los " + seg + " segundos son " + hora + " horas, " + minutos + " minutos y "
				+ segundos + "  segundos");
		
		sc.close();
	}

}
