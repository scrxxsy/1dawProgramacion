package prPractica02;

import java.util.Scanner;

/**
 * 53. Diseñar un algoritmo que determine si la cadena “abc”, aparece en una sucesión de caracteres cuyo final
	   viene dado por un punto. No se lee una cadena, sino caracteres sueltos.

 */

public class Ejercicioo53 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		char caracter;
		String cadena="";

		System.out.print("Teclee un carácter: ");
		caracter=sc.next().charAt(0);

		while (caracter!='.') {

			cadena+=caracter;

			System.out.print("Teclee un carácter: ");
			caracter=sc.next().charAt(0);
		}

		if (cadena.contains("abc")) {
			System.out.println("\nSe ha encontrado la cadena abc");
		}
		else {
			System.out.println("\nNo se ha encontrado la cadena abc");
		}
		
		sc.close();
	}
}

//do {
//    System.out.println("Introduce un caracter: ");
//    caracter = sc.next().charAt(0);
//    if((swA==false) || (swB==false) || (swC==false)) {                
//        if(caracter=='a') {
//            swA=true;}
//        else if ((caracter=='b') && (swA==true) && (swB==false)) {
//            swB=true;}
//        else if ((caracter=='c') && (swA==true) && (swB==true)) {
//            swC=true;
//        }
//        else {
//            swA = false;
//            swB = false;
//            swC = false;
//        }
//    }
//        
//        
//}
//while(caracter!='.');
