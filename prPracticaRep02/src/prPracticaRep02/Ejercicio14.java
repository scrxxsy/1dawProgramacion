package prPracticaRep02;

import java.util.Scanner;

/**
 * Escribir un programa que lea las temperaturas de 15 observatorios meteorológicos y escriba la
temperatura mínima y la temperatura máxima que se han producido.

 */
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura, max, min;
		Scanner sc = new Scanner (System.in);
		for (int cont=1; cont<=15; cont++) {
			
			System.out.println("\nObservatorio: " + cont);
			System.out.println("Introduzca el valor de la temperatura(salir con el 0): ");
			temperatura=sc.nextInt();
			
			max=temperatura;
			min=temperatura;
			
				while(temperatura!=0) {
					System.out.println("Introduzca el valor de la temperatura(salir con el 0): ");
					temperatura=sc.nextInt();
					
					if (temperatura!=0) {
					if(temperatura>max) {
						max=temperatura;
					}
					else if(temperatura<min) {
						min=temperatura;
					}
					}
					
				}
				System.out.println("\nTemperatura máxima en el observatorio " + cont + " es de " + max + " grados");
				System.out.println("Temperatura mínima en el observatorio " + cont + " es de " + min + " grados");
		}
		sc.close();

	}

}
