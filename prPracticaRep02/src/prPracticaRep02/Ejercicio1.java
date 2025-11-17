package prPracticaRep02;

/**
 * Cuadrado de los 100 primeros numeros pares
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contNum=0;
	
		for (int cont=0; cont <200; cont++) {
			if (cont%2==0) {
				System.out.println((int)Math.pow(cont, 2));
				
				contNum++;
			}
		}
		System.out.println(contNum);
		
	
	}

}
