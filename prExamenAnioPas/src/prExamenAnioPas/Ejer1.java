package prExamenAnioPas;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad;
		int contJu=0, contPro=0, contSen=0, contVetA=0, contVetB=0, contVetC=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su edad para inscribirse: ");
		edad=sc.nextInt();
		
		
		while(edad >= 0 ) {
			
		if (edad<18) {
			System.out.println("No pueden inscribirse menores de edad");
		}
			
		else if (edad <=22) {
			contJu++;
			
		}
		else if (edad <=30) {
			contPro++;
		}
		else if(edad <=39) {
			contSen++;
		}
		else if(edad <=49) {
			contVetA++;
		}
		else if(edad <=59) {
			contVetB++;
		}
		else {
			contVetC++;
		}
		 System.out.print("Indique su edad para inscribirse (negativo para salir): ");
         edad = sc.nextInt();
         
         
	}
		sc.close();
		
		if (contJu>0) {
			System.out.println("\nJunior " + contJu + " corredores");
		}
		else {
			System.out.println("Junior: Ningún inscrito");
		}
		if (contPro>0) {
			System.out.println("Promesas " + contPro + " corredores");
		}
		else {
			System.out.println("Promesas: Ningún inscrito");
		}
		if (contSen>0) {
			System.out.println("Senior " + contSen + " corredores");
		}
		else {
			System.out.println("Senior: Ningún inscrito");
		}
		if (contVetA>0) {
			System.out.println("Veterano A " + contVetA + " corredores");
		}
		else {
			System.out.println("Veterano A: Ningún inscrito");
		}	
		if (contVetB>0) {
			System.out.println("Veterano B " + contVetB + " corredores");
		}
		else {
			System.out.println("Veterano B: Ningún inscrito");
		}
		if (contVetC>0) {
			System.out.println("Veterano C " + contVetC + " corredores");
		}
		else {
			System.out.println("Veterano C: Ningún inscrito");
		}
	}
}
