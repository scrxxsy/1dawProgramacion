package prPractica01;

import java.util.Scanner;

/**
 * 12.- Escribir un programa que calcule el salario semanal de un trabajador, dada la tarifa horaria por
 *  horas y
el número de horas trabajadas. Además, hay que tener en cuenta que se le practica una retención del
4% para la S.S. y del 7% para el IRPF. Es decir, solicitaremos por teclado, cuánto cobra por hora (tarifa
horaria), así como las horas trabajadas, y mostraremos por pantalla el sueldo semanal del trabajador
según los datos proporcionados.
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final float SS = 0.04f;
		final float IRPF = 0.07f;
		float pagaphora;
		int horastrab;
		
		System.out.println("Introduzca cuanto es la cantidad que te pagan por hora: ");
		pagaphora= sc.nextFloat();
		
		System.out.println("Introduzca la cantidad de horas realizadas esta semana: ");
		horastrab=sc.nextInt();
		
		float totalsinporc = (pagaphora)*(horastrab);
		
		System.out.println("El total del sueldo semanal sin quitar el porcentaje es: " + totalsinporc);
		
		float porcss = (totalsinporc) * (SS);
		float porcirpf = (totalsinporc) * (IRPF);
		float totalconporc = (totalsinporc) - ((porcss) + (porcirpf));
		
		System.out.println("El total del sueldo semanal quitando el porcentaje es: " + totalconporc);
		
		
		
		sc.close();
	}

}
