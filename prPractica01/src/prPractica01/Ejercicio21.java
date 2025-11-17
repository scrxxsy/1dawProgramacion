package prPractica01;

import java.util.Scanner;

/**
 *  Una empresa que gestiona un parque acuático nos solicita una aplicación que les ayude a calcular el 
importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será 
introducido por el usuario). Existen dos tipos de entradas: infantiles, que cuestan 15.50€, y de adultos 
que cuestan 20€. 
En el caso de que el importe total sea igual o superior a 100€, se aplicará automáticamente un bono 
descuento del 5%.
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		final float ENTINF = 15.50f;
		final float ENTADU = 20f;
		final float POR = 0.05f;
		
		int caninf, canadu;
		
		System.out.println("Introduzca la cantidad de entradas infantiles: ");
		caninf=sc.nextInt();
		
		System.out.println("Introduzca la cantidad de entradas adultos");
		canadu=sc.nextInt();
		
		float totalapagar = (caninf*ENTINF) + (canadu*ENTADU);
		float totalconpor = (totalapagar*POR);
		
		System.out.println("\nSería un total de " + (totalapagar>=100 ? totalapagar - totalconpor : totalapagar) + "€");
		
		
		
		sc.close();

	}

}
