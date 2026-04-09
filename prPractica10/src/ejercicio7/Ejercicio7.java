package ejercicio7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Crea una interfaz InterfazPila, con los métodos pop, push, isVacia y cima. 
		Implementa esta interfaz en la  clase Pila, en la cual los elementos de la pila se 
		guardarán en una colección tipo List o Deque, os aconsejo que lo hagáis con ambas. 
		Utilizando alguna de estas clases, hacer un programa para evaluar una expresión 
		aritmética escrita en notación postfija e introducida desde teclado.
		También podéis hacer un algoritmo que compruebe si una cadena está correctamente 
		balanceada en paréntesis. **/
		
		Deque<String> pila = new LinkedList<>();
		
		
		String cad = "((2+4)*(9-2))";
		
		try {
			for(int cont= 0; cont<=cad.length(); cont++) {
				if(cad.charAt(cont)=='(') {
					pila.push("(");
				}
				else if (cad.charAt(cont)==')') {
					pila.pop();
				}
					
			
			
			}
			
			if(pila.isEmpty()) {
				System.out.println("Cadena correctamente balanceda");
			}
			else {
				System.out.println("Se han cerrado más paréntesis de la cuenta");
			}
		}
		catch (NoSuchElementException e) {
			System.out.println("No estan bien los paréntesis cerrados");
		}
		
		
	}

}
