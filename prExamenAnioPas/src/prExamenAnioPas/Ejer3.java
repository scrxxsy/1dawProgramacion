package prExamenAnioPas;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int  numTiradas;
		 int resultado;
		 int contIntentos=0;
		 int contCincos=0;
	
		 float media=0;
		 
		 
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("¿Cuántas pruebas quieres realizar para el estudio?:");
		 numTiradas=sc.nextInt();
		 
		 if (numTiradas<=0) {
			 System.out.println("El número de tiradas debe ser positivo");
			 
		 }
		 else {
		 
		 for (int i = 1; i <=numTiradas; i++) {
			System.out.println("Tirada " + i);
			
		
			
			while (contCincos<5) {
				resultado = (int)(Math.random()*6 + 1);
				
				System.out.print(" " + resultado);
				
				if(resultado==5) {
					contCincos++;
					
				}
				
				else {
					contIntentos++;
				}
				
				
			}
			System.out.println("\nIntento " + i + " : tiradas " +  contIntentos);
			media +=contIntentos;
			
			contCincos=0;
			contIntentos=0;
		
			
			
		
		 }
		 System.out.println("La media para sacar la 4 fichas es: " + (media/(float)numTiradas));
		
		 
		 
		 
		 sc.close();
		 }
	}

}
