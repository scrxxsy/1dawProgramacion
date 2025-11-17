package prPractica02;

import java.util.Scanner;

/**
 * Una empresa maneja códigos numéricos con las siguientes características: 
▪ Cada código consta de 4 dígitos. 
▪ El primero representa una provincia. 
▪ El segundo el tipo de operación. 
▪ Los dos últimos el número de operación. 
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int codigo;
		
		System.out.println("Introduzca el código: ");
		codigo=sc.nextInt();
		if(codigo<9999 && codigo >= 1000) {
		System.out.println("PROVINCIA: " + (codigo/1000)%100 +
						  "\nTIPO DE OPERACIÓN: " + (codigo/100)%10 +
						  "\nNUMERO DE OPERACIÓN: " + codigo%100);
		}
		else {
			System.out.println("ERROR, CÓDIGO INVÁLIDO");
		}
			
		
		sc.close();
	}

}
