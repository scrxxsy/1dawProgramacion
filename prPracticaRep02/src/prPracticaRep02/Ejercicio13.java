package prPracticaRep02;

import java.util.Scanner;

/**
 * Diseñar un programa que muestre la suma de los números impares comprendidos entre dos valores
numéricos enteros y positivos introducidos por teclado.

 */
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2, suma = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca el valor del primer número: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el valor del segundo número: ");
		num2=sc.nextInt();
		
		if(num1 < 0 || num2 < 0 ){
			System.out.println("Los números deben de ser positivos: ");
				
		}
		else {
			
		if(num2<num1) {
			int aux=num1;
			num1=num2;
			num2=aux;
		}
			for(int cont=num1; cont<=num2; cont++) {
				if(cont%2!=0) {
					suma+=cont;
				}
			}
			System.out.println("La suma de los números impares entre " + num1 + " y " + num2 + " es " + suma);
		}
	
		
		
		
		
		sc.close();
		}
	}
	




