package ej1_9;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Desarrolla un programa que lea las notas de un determinado examen, y las almacene en un array, 
		mostrando a continuación, la nota media, la nota más alta y la nota más baja. El programa lo primero 
		que solicitará será el número de alumnos que han realizado el examen, y en función de ese valor se 
		definirá el array. 
		 */
		
		int [] notas;
		int numaAlum, suma, max, min;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Número de alumnos que se han presentado en el examen: ");
		numaAlum=sc.nextInt();
		
		
		sc.close();

		notas = new int [numaAlum];
		
		System.out.println("Notas examnen: ");
		for(int i = 0; i<notas.length; i++) {
			notas[i] = (int) ((Math.random()*10)+1);
			System.out.print(notas[i] + " ");
		}
		
		max = notas[0];
		min = notas [0];
		suma = notas [0];
		
		for (int i = 0; i<notas.length; i++) {
			if(notas[i]>max) {
				max= notas[i];
			}
			else if (notas[i]<min) {
				min = notas [i];
				}
			suma += notas[i];
			}
		System.out.println("\n\nNota máxima: " + max);
		System.out.println("Nota mínima: " + min);
		System.out.println("Media de notas: " + suma/numaAlum);
		}
		
	
	
}
