package prPractica02;

/**
 * Hacer un algoritmo para mostrar por pantalla 100 veces de una forma alternativa: Hola, Adiós.
 */

public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int cont=0; cont<=100; cont++) {
			if(cont%2!=0) {
				System.out.println("Hola");
				
			}
			else {
				System.out.println("Adiós");
			}
		}

	}

}
