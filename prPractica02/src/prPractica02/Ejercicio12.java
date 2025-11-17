package prPractica02;

/**
 * 12. Diseñar un algoritmo para simular una calculadora simple. Para ello deberá tener las siguientes 
características: 
✓ Sólo efectuará operaciones con dos operandos. 
✓ Operaciones permitidas: (+, -, *, /). 
✓ Se trabajará con operandos enteros. 
✓ Pedirá en primer lugar el operador, y a continuación los dos operandos. Si el operador no se 
corresponde con alguno de los indicados se emitirá un mensaje de error:
 */

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		char operador;
		int num1, num2;
		
	
				
		System.out.println("Introduzca el operador: ");
		operador =sc.next().charAt(0);
		if(operador!='+' && operador!='-' && operador!='*' && operador!='/') { 
			System.out.println("ERROR, OPERACIÓN NO VÁLIDA");
		}
		else {
		System.out.println("Introduza el valor del primer operando: ");
		num1=sc.nextInt();
		
		System.out.println("Introduza el valor del primer operando: ");
		num2=sc.nextInt();

		
		switch (operador) {
		case '+': 
			System.out.println("Operación: " + operador +
							"\nOperando 1: " + num1 +
							"\nOperando 2: " + num2 + 
							"\nResultado: " + (num1+num2)
							);
		break;
		case '-':
			System.out.println("Operación: " + operador +
					"\nOperando 1: " + num1 +
					"\nOperando 2: " + num2 + 
					"\nResultado: " + (num1-num2)
					);
		break;
		case '*':
			System.out.println("Operación: " + operador +
					"\nOperando 1: " + num1 +
					"\nOperando 2: " + num2 + 
					"\nResultado: " + (num1*num2)
					);
		break;
		case'/':
			System.out.println("Operación: " + operador +
					"\nOperando 1: " + num1 +
					"\nOperando 2: " + num2 + 
					"\nResultado: " + (num1/num2)
					);
		break;
			
			
		}
		
		
		}
		sc.close();

	}

}
