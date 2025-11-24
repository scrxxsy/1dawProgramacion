package LibreriaMatematica;

import java.util.Scanner;



public class TestFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables locales
		int numero;
		long resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor del número: ");
		numero=sc.nextInt();
		
		sc.close();
		
		resultado = LibreriaMatematica.calcularFactorial(numero);
		if(resultado==-1) {
			System.out.println("No existe el factorial de números negativos");
		}
		else {
		System.out.println("Factorial (" + numero + ") = " + LibreriaMatematica.calcularFactorial(numero));	
		}
		System.out.println("Método que devuelve el resultado del factorial de un número: ");
		
		for (int cont = 0; cont<=10; cont++) {
			System.out.println("Factorial (" + cont + ") = " + LibreriaMatematica.calcularFactorial(cont));
		}
		
	
	}
}
