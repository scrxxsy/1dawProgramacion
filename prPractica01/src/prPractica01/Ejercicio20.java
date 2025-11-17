package prPractica01;

import java.util.Scanner;

/**
 * Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación 
que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados 
durante una jornada de trabajo. Para ello, nos ha solicitado una aplicación a la que hay que 
proporcionar: 
• El número de hormigas capturadas (6 patas). 
• El número de arañas capturadas (8 patas). 
• El número de cochinillas capturadas (14 patas). 
La aplicación debe mostrar el número total de patas.
 */

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		final int PATHOR=6;
		final int PATARA=8;
		final int PATCOC=14;
		
		int numhor, numara, numcoc;
		
		System.out.println("Introduzca el número de hormigas: ");
		numhor=sc.nextInt();
		
		System.out.println("Introduzca el número de arañas: ");
		numara=sc.nextInt();
		
		System.out.println("Introduzca el número de cochinillas: ");
		numcoc=sc.nextInt();
		
		numhor = (PATHOR)*(numhor);
		numara = (PATARA)*(numara);
		numcoc = (PATCOC)*(numcoc);
		
		int totaldepatas = (numhor) + (numara) + (numcoc);
		
		
		System.out.println("El número total de patas es: " + totaldepatas);
		
		sc.close();
	}

}
