package prPractica02;

import java.util.Scanner;

/**
 * 5. En una partida de un determinado juego, según los puestos conseguidos se obtiene un grado u otro, 
siguiendo la siguiente tabla: 
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int grado;
			
			System.out.println("Introduzca la cantidad de puntos: ");
			grado=sc.nextInt();
			
			if (grado < 60) {
				System.out.println(grado + " corresponde al grado E");
			}
			else if (grado <= 69) {
				System.out.println(grado + " corresponde al grado D");
			}
			else if (grado <= 79) {
				System.out.println(grado + " corresponde al grado C");
			}
			else if (grado <= 89) {
				System.out.println(grado + " corresponde al grado B");
			}
			else
				System.out.println(grado + " corresponde al grado A");
			sc.close();

	}

}
