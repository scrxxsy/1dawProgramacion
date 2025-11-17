package prPractica01;

import java.util.Scanner;

/**
 * Diseña un programa que solicite al usuario su edad, y a continuación indique 
 * si es mayor o menor de
edad, os podéis ayudar del operador condicional, 
no se puede utilizar la sentencia condicional if.

 */
public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		byte edad;
		
		System.out.println("Introduzca la edad: ");
		edad=sc.nextByte();
		
		System.out.println(edad>=18?"Es mayor de edad" : "Es menor");
		sc.close();

	}

}
