package prPractica02;

import java.util.Scanner;

/**
 * 18. Un programa posee tres bucles anidados, cuyas variables de control toman M, N y K valores 
respectivamente. Determinar cuántas veces se ejecutan las instrucciones del cuerpo del bucle más 
interno.
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int M=2, N=3, K=4;
		
		for (int i = 0; i<M; i++) {
			for (int j = 0; j<N; j++) {
				for (int k = 0; k<K; k++) {
					System.out.println();
				}
			}
		}
		
		
		
		sc.close();
	}

}
