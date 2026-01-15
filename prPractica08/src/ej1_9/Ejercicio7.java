package ej1_9;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Crear e imprimir una lista unidimensional de 50 elementos con números aleatorios entre 1 y 100 de tal 
		forma que no se repita ninguno.
		 */
		int [] array = new int [50];
		boolean seguir=true;
		int numrandom;
		
		for (int cont = 0; cont<array.length; cont++) {
				do {
					seguir = false;
					numrandom = (int)(Math.random()*100)+1;
					
					for (int cont2=0; cont2<array.length; cont2++) {
						if(numrandom==array[cont2]) {
							seguir = true;
							
						}
						
					}
					array[cont]= numrandom;					
				}
				
				
				while(seguir);
				
			
		}
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
