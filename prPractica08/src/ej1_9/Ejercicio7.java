package ej1_9;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Crear e imprimir una lista unidimensional de 50 elementos con números aleatorios entre 1 y 100 de tal 
		forma que no se repita ninguno.
		 */
		
		int [] array = new int [50];
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int) ((Math.random()*100)+1);
		}	
		
		for (int i = 0; i <array.length; i++) {
			
		}
		

	}

}
