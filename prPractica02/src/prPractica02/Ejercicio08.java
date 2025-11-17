package prPractica02;

import java.util.Scanner;

/**
 * Realizar un algoritmo que lea dos valores desde teclado y diga si cualquiera de ellos divide de forma 
entera al otro. 
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Introduzca el primer valor: ");
		num1=sc.nextInt();
		
		System.out.println("Introduzca el segundo valor: ");
		num2=sc.nextInt();
		
		if(num1%num2==0) {
			System.out.println("El número " + num2 + " divide de manera entera a " + num1 );
		}
		else if (num2%num1==0) {
			System.out.println("El número " + num1 + " divide de manera entera a " + num2 );	
		}
		else
			System.out.println("No se pueden dividir entre ellos de manera entera");
		sc.close();

	}

}
