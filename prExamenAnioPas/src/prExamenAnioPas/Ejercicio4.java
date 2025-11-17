package prExamenAnioPas;

import java.util.Scanner;

/**
 * Diseña un programa que permita registrar las temperaturas máximas diarias de una ciudad durante 
 * un mes (30 días). El programa debe:
Solicitar al usuario las temperaturas día por día.
Calcular y mostrar:
La temperatura media del mes.
El día con la temperatura más alta y el día con la más baja.
Cuántos días superaron los 35 °C (días de ola de calor).
Cuántos días estuvieron por debajo de 10 °C (días fríos).
Mostrar una advertencia si hay más de 5 días de ola de calor consecutivos.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int temperatura, max, min, contOladeCalor=0, contDiasFrios=0, contDias=1;
		float media=1;
		final float DIAS = 6;
		mirar
		System.out.println("Introduzca la temperatura: ");
		temperatura=sc.nextInt();
		
		max=temperatura;
		min=temperatura;
		
		
		while(contDias<DIAS) {
			System.out.println("Introduzca la temperatura: ");
			temperatura=sc.nextInt();
			
			media+=temperatura;
			
			if(temperatura>max) {
				max=temperatura;
			}
			else if(temperatura<min) {
				min=temperatura;
			}
			
			if(temperatura>35) {
				contOladeCalor++;
			}
			else if (temperatura < 10) {
				contDiasFrios++;
			}

			
			contDias++;
		
		}
		System.out.println("La media es de temperatura mensual es de: " + (float)media/DIAS);
		System.out.println("Temperatura máxima: " + max);
		System.out.println("Temperatura mínima: " + min);
		System.out.println("Días de ola de calor: " + contOladeCalor);
		System.out.println("Días fríos: " + contDiasFrios);
		
		
		sc.close();
		
		

	}

}
