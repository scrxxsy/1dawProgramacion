package prPractica02;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num1,num2, suma =0, aux;
		
		System.out.println("Introduzca el valor inicial: ");
		num1=sc.nextInt();
		
		System.out.println("Introduzca el valor final: ");
		num2=sc.nextInt();
		
		if (num1>num2) {
			aux=num1;
			num1=num2;
			num2=aux;
			for (int cont = num1; cont<=num2; cont++) {
				suma = suma + cont;
				
			}
			
			
		}
		else {
			for (int cont = num1; cont<=num2; cont++) {
				suma = suma + cont;
				
			}
			
		}
		System.out.println("La suma es : " + suma);
	
		sc.close();

	}

}
