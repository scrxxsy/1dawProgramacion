package prPractica01;

import java.util.Scanner;

/**
 * Diseñar un programa que, a partir de los tres puntos extremos (P1, P2 y P3) 
 * de un triángulo, calcule el 
área del mismo, de acuerdo con la siguiente fórmula: 
 */


public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int p1x,p1y,p2x,p2y,p3x,p3y;
		
		System.out.println("Introduzca el valor de x del p1: ");
		p1x=sc.nextInt();
		
		System.out.println("Introduzca el valor de y del p1: ");
		p1y=sc.nextInt();
		System.out.println("Introduzca el valor de x del p2: ");
		p2x=sc.nextInt();
		System.out.println("Introduzca el valor de y del p2: ");
		p2y=sc.nextInt();
		System.out.println("Introduzca el valor de x del p3: ");
		p3x=sc.nextInt();
		System.out.println("Introduzca el valor de y del p3: ");
		p3y=sc.nextInt();
		
		double s1= (Math.sqrt(Math.pow(p1x-p2x,2)+ Math.pow(p1y-p2y,2)));
		
		double s2= (Math.sqrt(Math.pow(p2x-p3x,2)+ Math.pow(p2y-p3y,2)));
		
		double s3= (Math.sqrt(Math.pow(p3x-p1x,2)+ Math.pow(p3y-p1y,2)));
		
		double t = (s1+s2+s3)/2;
		
		double area = Math.sqrt((t*(t-s1)*(t-s2)*(t-s3)));
		
		System.out.println("El area del triángulo es " + area);
		
		sc.close();

	}

}