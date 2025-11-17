package prExamenAnioPas;

import java.util.Scanner;

/**
 * Realiza un programa que simule el lanzamiento de tres dados. 
 * El programa debe mostrar el valor de cada dado, calcular la suma total y el promedio de los tres valores. 
 * Finalmente, debe mostrar un mensaje indicando si los tres dados han sacado el mismo número
 */

public class Ejercicio3v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int dado1,dado2,dado3, lanzamientos, total=0;
		
		System.out.println("Introduzca la cantidad de lanzamientos: ");
		lanzamientos=sc.nextInt();
		
		if(lanzamientos<=0) {
			System.out.println("El número de tiradas debe de ser positivo");
		}
			
		else {
			for(int cont=0; cont<lanzamientos; cont++) {
				
				dado1=(int)(Math.random()*6 +1);
				dado2=(int)(Math.random()*6 +1);
				dado3=(int)(Math.random()*6 +1);
				
				System.out.println("\nDado 1: " + dado1);
				System.out.println("Dado 2: " + dado2);
				System.out.println("Dado 3: " + dado3);
				
				total=dado1+dado2+dado3;
				
				System.out.println("\nLa suma es: " + total);
				System.out.println("La media es: " + total/3.0f);
				
				if(dado1==dado2 && dado2==dado3) {
					System.out.println("\nLos tres dados han sacado el mismo número");
				}
			}
		}
		
		
		
		sc.close();
		
		

	}

}
