package ej3recu;

import java.util.Scanner;

public class TestSumaDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		int num;
		
		
		System.out.print("Introduzca el número al cuál le quiere realizar la suma de sus dígitos: ");
		num=sc.nextInt();
		
		System.out.println("\n\tLa suma de digitos de " + num + " es " + "[" + sumaDigitosNum(num) + "]");
	
		
		
		sc.close();

	}
	public static int sumaDigitosNum(int num) {
		//Deben de ser positivos para su cáculo
		num=Math.abs(num);
		

					
		if (num<10) {
			return num;
		}
		
		
		return num;
		
	}
	

}
