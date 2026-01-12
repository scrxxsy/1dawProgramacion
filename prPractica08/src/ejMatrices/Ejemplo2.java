package ejMatrices;

import java.util.Scanner;

/**
 * Clase que genera una matriz cuadrada del tamaño que nos indique el usuario sus valores
 * serán aleatorios, excepto el de la diagonal principal que será siempre 1
 */

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int [][] matriz;
		int tamanioFilCol;
		
		System.out.print("Introduzca el tamaño de filas y columnas para la matriz: ");
		tamanioFilCol=sc.nextInt();
		
		matriz = new int  [tamanioFilCol] [tamanioFilCol];
		
		for (int filas=0; filas < matriz.length; filas++) {
			for (int col = 0; col < matriz[filas].length; col++) {
				
				matriz[filas][col] = (int)(Math.random()*100);
				if(filas==col) {
					matriz[filas][col]=1;
				}
			}
			
		}
		
		for (int filas=0; filas < matriz.length; filas++) {
			for (int col = 0; col < matriz[filas].length; col++) {
				
				System.out.print(matriz[filas][col] + "\t");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
