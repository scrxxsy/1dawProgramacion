package prPractica02;

/**
 * 
 */
import java.util.Scanner;

public class Ejercicio27 {

	/**
	 * Hacer un algoritmo para calcular el factorial de un número natural positivo, se debe tener en cuenta si
el número no es positivo, ya que no existe el factorial de los números negativos.

	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		int total = 1;
		
	
		
		System.out.println("Introduzca el número al que le quiere realizar el factorial:");
		num=sc.nextInt();
		
		if(num < 0) {
			System.out.println("No existe los factoriales de números negativos");
		}
		
		else {
		for (int cont=1; cont <=num; cont++) {
			total = total * cont;
		
		}
		System.out.println(total);
		
		}
		sc.close();
		
	}

}
