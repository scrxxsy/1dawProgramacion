package LibreriaMatematica;

public class TestLibreriaMatematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**a) Método al que pasándole un número nos devuelva un valor lógico, el cual indicará si el número es primo 
		o no.**/
		
		System.out.println("Método que indica si un número es primo o no: ");
		System.out.println(LibreriaMatematica.esPrimo(-1));
		
		/**
		 * b) Método que calcule el factorial de un número, en caso de números negativos debe devolver -1.
		 */
		System.out.println("Método que devuelve el factorial de un número: ");
		System.out.println(LibreriaMatematica.calcularFactorial(-2));
		
		/**
		 * c) Método que calcule el combinatorio de dos números dados, se debe tener en cuenta que para poder calcular
		 *  el combinatorio de dos números se debe cumplir que a ≥ b, a ≥ 0 y b ≥ 0.
		 */

		System.out.println("Método que devuelve el combinatorio, dados dos números: ");
		System.out.println(LibreriaMatematica.calcularCombinatorio(10, 2));
		
		System.out.println(LibreriaMatematica.numDivisores(78));
	}

}
