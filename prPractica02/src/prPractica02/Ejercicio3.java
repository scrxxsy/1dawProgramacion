package prPractica02;

import java.util.Scanner;

/**
 * si (edad >=65) entonces 
escribir(“Jubilado”) 
si-no 
si (edad < 18) entonces 
escribir(“Menor de edad”) 
si-no 
si ((edad >= 18) Y (edad < 65)) entonces 
escribir(“Activo”) 
fin-si 
fin-si 
fin-si
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int edad;
		
		System.out.println("Introduzca la edad: " );
		edad=sc.nextInt();
		
		if(edad < 1 || edad > 100) {
			System.out.println("Edad errónea");
		}
		
		else {
			if (edad >= 67) {
				System.out.println("Jubilado");
		
				
			}
			else if (edad < 18) {
					System.out.println("Menor de edad");
		
			}
			else {
				System.out.println("Activo");
			}
			sc.close();
		}
	}
}


