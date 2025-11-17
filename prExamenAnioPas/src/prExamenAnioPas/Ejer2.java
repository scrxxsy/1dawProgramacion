package prExamenAnioPas;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double MONTAJE = 80;
		final double PRECIO_CAKEPOPS = 0.25;
		final double PRECIO_DONUTS = 0.30;
		final double PRECIO_FUENTE = 100;

		double numInv, total=80;
		char cakepops, donuts, fuentecho;
	
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Indique el número de invitados al evento: ");
		numInv=sc.nextDouble();
		
		System.out.print("¿Desea añadir cake pops?(s/n): ");
		cakepops=sc.next().charAt(0);
		
		System.out.print("¿Desea añadir donuts?(s/n): ");
		donuts=sc.next().charAt(0);
		
		System.out.print("¿Desea añadir una fuente de chocolate?(s/n): ");
		fuentecho=sc.next().charAt(0);
		
		total += numInv;
		double total_cakepops= numInv * PRECIO_CAKEPOPS;
		double total_donuts= numInv * PRECIO_DONUTS;
		
		
		
		if(Character.toUpperCase(cakepops) == 'S') {
			total += total_cakepops;
	
		}
		
		if(Character.toUpperCase(donuts) == 'S') {
			total += total_donuts;
		
		}
		
		if(Character.toUpperCase(fuentecho) == 'S') {
			total +=PRECIO_FUENTE;
		
		}
		
		System.out.println("\nEL COSTE TOTAL DE LA MESA ASCIENDE A: " + total + " €" +
							"\nCoste de montaje: " + (int)MONTAJE +
							"\nNúmero de invitados: " + (int)numInv +
							"\nCake Pops: " + ((Character.toUpperCase(cakepops) == 'S') ? "SI" : "NO") +
							"\nDonuts: " + ((Character.toUpperCase(donuts) == 'S') ? "SI" : "NO") +
							"\nFuente de chocolate: " + ((Character.toUpperCase(fuentecho) == 'S') ? "SI" : "NO")
				
				);
		
		
		sc.close();
	}

}
