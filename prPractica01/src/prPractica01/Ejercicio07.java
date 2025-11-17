package prPractica01;

import java.util.Scanner;

/**
 *  Un agricultor que se dedica al cultivo ecológico de naranjas y 
 *  limones, quiere calcular los beneficios 
que obtiene anualmente por la venta de los mismos. 
Por este motivo vamos a diseñar una aplicación 
que solicite las ventas (en kilos) de cada semestre para cada fruta. 
La aplicación mostrará el importe 
total sabiendo que el precio del kilo de naranjas está fijado en 1.25€ 
y el kilo de limones en 1.90€ 
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		final float naranjas = 1.25f;
		final float limones = 1.90f;
		float kn1;
		float kl1;
		float kn2;
		float kl2;
		
		System.out.println("Introduzca la cantidad en kilos de naranjas recogidas en el primer semestre: ");
		kn1=sc.nextFloat();
		System.out.println("Introduzca la cantidad en kilos de limones recogidas en el primer semestre: ");
		kl1=sc.nextFloat();
		
		float totalprimersemestre= ((kn1 * naranjas) + (kl1 * limones));
		
		System.out.println("Introduzca la cantidad en kilos de naranjas recogidas en el segundo semestre: ");
		kn2=sc.nextFloat();
		System.out.println("Introduzca la cantidad en kilos de limones recogidas en el segundo semestre: ");
		kl2=sc.nextFloat();
		
		float totalsegundosemestre= ((kn2 * naranjas) + (kl2 * limones));
		float totalanual= ((totalprimersemestre)+(totalsegundosemestre));
		
		
		System.out.println("El total anual es de: " + totalanual + "€");
				
		sc.close();

	}

}
