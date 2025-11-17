package prPractica02;

import java.util.Scanner;

/**
 * 14. Diseñar un algoritmo para leer las longitudes de los lados de un triángulo y determine que tipo de 
triángulo es, de acuerdo a los siguientes casos: suponiendo que A es el mayor de los lados y que B y C 
corresponden a los otros 2 lados: 
Si A >= B + C    No es un triángulo 
Si A² = B² + C²   Triángulo rectángulo 
Si A² > B² + C²   Triángulo obtusángulo 
Si A² < B² + C²   Triángulo acutángulo
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		float a,b,c;
		
		System.out.println("Introduzca el valor de A: ");
		a=sc.nextFloat();
		
		System.out.println("Introduzca el valor de B: ");
		b=sc.nextFloat();
		
		System.out.println("Introduzca el valor de C: ");
		c=sc.nextFloat();
		
		
		if (Math.pow(a, 2) == (Math.pow(b,2) + Math.pow(c,2))) {
			System.out.println("Triángulo rectángulo");
		}
		else if (Math.pow(a, 2) > (Math.pow(b,2) + Math.pow(c,2))) {
			System.out.println("Triángulo obtusángulo");
		}
		else if (Math.pow(a, 2) < (Math.pow(b,2) + Math.pow(c,2))) {
			System.out.println("Triángulo acutángulo");
		}
		else {
			System.out.println("No es un triángulo");
		}
		sc.close();
	}

}
