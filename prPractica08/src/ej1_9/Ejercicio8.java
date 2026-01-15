package ej1_9;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		8.- Hacer un programa que: 
		//			 Cree y cargue un array unidimensional de 12 elementos de tipo entero. 
		//			 Recorra ese array metiendo en un segundo array todos aquellos elementos que sean pares y 
		//			mayores que 25. 
		//			 Muestre en pantalla el contenido de los dos arrays unidimensionales. 

		int array1 [] = new int [12];
		int array2 [];
		int tamanioarray2=0;
		int contador=0;
		
		try (Scanner sc = new Scanner (System.in)){

			for (int cont = 0; cont<array1.length; cont++) {
				System.out.print("Valor " + (cont+1) + " del primer array: ");
				array1[cont] =  sc.nextInt();
					if (array1[cont]%2==0 && array1[cont]>25) {
						tamanioarray2++;
					}


			}	
		
			
			array2 = new int [tamanioarray2];
			
			for (int cont2 = 0; cont2 < array1.length; cont2++) {
				if (array1[cont2]%2==0 && array1[cont2]>25) {
					array2[contador] = array1[cont2];
					contador++;
				}
			}
			System.out.println(Arrays.toString(array2));
			System.out.println(Arrays.toString(array1));
			System.out.println(tamanioarray2);
			
			
		}

	}

}
