package prExamen01;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final double GAS95 = 1.45;
			final double GAS98 = 1.65;
			final double DIESEL = 1.40;
			final double DIESELPLUS = 1.50;
			double litros, importe=0, total=0,litrosTotales=0;
			int opciongas;
			char continuacion = 's';
			
			
			
			
			Scanner sc = new Scanner (System.in);
				
			System.out.println("Introduce los litros a respostar: ");
			litros = sc.nextInt();
			

			
			System.out.println("=== Tipos de combustible ===" +
			"\n1. Gasolina 95 (1.45 €/L)" + 
			"\n2. Gasolina 98 (1.65 €/L)"
			+ "\n3. Diésel (1.4 €/L)"
			+ "\n4. Diésel plus (1.5 €/L)");
			
			System.out.println("Elige tipo de combustible (1-4): ");
			opciongas=sc.nextInt();
			if(opciongas == 1) {
				importe = (litros * GAS95);
			}
			else if(opciongas == 2) {
				importe = (litros * GAS98);
			}
			
			else if(opciongas == 3) {
				importe = (litros * DIESEL);
			}
			else if(opciongas == 4) {
				importe = (litros * DIESELPLUS);
			}

			total+=importe;
			litrosTotales+=litros;
			
			System.out.println("Importe a pagar " + importe);
			
					
			System.out.println("¿Deseas atender a otro vehículo? (s/n) ");
			continuacion=sc.next().charAt(0);
			System.out.println("Introduce los litros a repostar : ");
			litros = sc.nextDouble();
			
			if (litros<=0) {
				System.out.println("Cantidad inválidad. No se puede repostar un valor negativo o cero");
		
			}
			else {
			while(continuacion == 's') {
					
					total+=importe;
					litrosTotales+=litros;
				
					System.out.println("=== Tipos de combustible ===" +
							"\n1. Gasolina 95 (1.45 €/L)" + 
							"\n2. Gasolina 98 (1.65 €/L)"
							+ "\n3. Diésel (1.4 €/L)"
							+ "\n4. Diésel plus (1.5 €/L)");
							
							System.out.println("Elige tipo de combustible (1-4): ");
							opciongas=sc.nextInt();
							if(opciongas == 1) {
								importe = (litros * GAS95);
							}
							else if(opciongas == 2) {
								importe = (litros * GAS98);
							}
							
							else if(opciongas == 3) {
								importe = (litros * DIESEL);
							}
							else if(opciongas == 4) {
								importe = (litros * DIESELPLUS);
							}
							else {
								System.out.println("Tipo de combustible no válido. Se cancela el repostaje");
							}
							System.out.println("Importe a pagar " + importe);
							
							System.out.println("¿Deseas atender a otro vehículo? (s/n) ");
							continuacion=sc.next().charAt(0);
							
							System.out.println("Introduce los litros a repostar : ");
							litros = sc.nextDouble();
				}
				
				
			System.out.println("Fin del servicio." +
			"\nTotal de litros vendidos: " + litrosTotales +
			"\nTotal recaudado: " + total);
			}
			
			
			
			
			sc.close();
	}

	}


