package prPractica01;

import java.util.Scanner;

/**
 * 4.-  Diseñar una aplicación que calcule la longitud y el área de una 
 * circunferencia. Para ello el usuario debe 
introducir el radio (que puede contender decimales).  
longitud = 2 . π . radio 
area = π . radio2
 */

public class Ejercicio04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
	
	
	
	double radio;
	
	System.out.println("Introduzca el radio de la circunferencia: ");
	
	radio=sc.nextFloat();
	
	double longitud= (2*Math.PI*radio);
	double area = (Math.PI*Math.pow(radio, 2));
	
	System.out.println("La longitud de la circunferencia es de " + longitud + " y el área " + area	);
	sc.close();
		  
	}	
}
