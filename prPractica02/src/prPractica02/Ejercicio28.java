package prPractica02;

import java.util.Scanner;

/**
 * Hacer un algoritmo que imprima, sume y cuente los números pares que hay entre dos números
determinados, debéis tener en cuenta si el primero de los números no es más pequeño que el segundo
 */

public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num1, num2, aux;
		int suma=0;
		int cont_num = 0;
		
		System.out.println("Introduzca el valor inicial: ");
		num1=sc.nextInt();
		
		System.out.println("Introduzca el valor final: ");
		num2=sc.nextInt();
		
		if (num1>num2) {
			aux=num1;
			num1=num2;
			num2=aux;
			for (int cont = num1; cont<=num2; cont++) {
				if(cont%2==0) {
					suma = suma + cont;
				}
				
			}
			
			
		}
		else {
			for (int cont = num1; cont<=num2; cont++) {
				if(cont%2==0) {
				suma = suma + cont;
				cont_num++;
				}
			}
			
		}
		System.out.println("La suma es : " + suma + " de un total de " + cont_num+ " números");
	
		sc.close();
	}

}
