package LibreriaMatematica;

import java.util.Scanner;

public class TestCombinatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		double resultado;
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Introduzca el valor para a: ");
			a=sc.nextInt();
			
			System.out.println("Introduzca el valor para b: ");
			b=sc.nextInt();
		}
		
		resultado = LibreriaMatematica.calcularCombinatorio(a, b);
		if(resultado==-1) {
			System.out.println("Valores no válidos");
		}
		else
			System.out.println("Combinatorio(" +a+ "," +b+") = " + resultado);
		
		System.out.println("Método que devuelve el resultado del combinatorio de dos números: ");
		System.out.println(LibreriaMatematica.calcularCombinatorio(0, 0));
		System.out.println(LibreriaMatematica.calcularCombinatorio(10, 4));
		System.out.println(LibreriaMatematica.calcularCombinatorio(10, 2));
		System.out.println(LibreriaMatematica.calcularCombinatorio(-2, -5));
	}

}
	