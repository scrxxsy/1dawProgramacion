package prPractica02;

import java.util.Scanner;

/**
 *  Diseñar un algoritmo que lee un número y un valor entre 1 y 3, y en función de este último calcula: 
1.-  El cuadrado del número 
2.- El cubo del número 
3.-  La raíz cuadrada del número
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		float num;
		int operando;
		
		System.out.println("Introduzca el número a operar: ");
		num=sc.nextFloat();
		System.out.println("Introduzca que operador quiere utilizar: ");
		operando=sc.nextInt();
		
		if(operando!=1 && operando!=2 && operando!=3) {
			System.out.println("ERROR");
			
		}
		else {
			switch (operando) {
			case 1:
				System.out.println(Math.pow(num, 2));
		
				break;
			case 2:
				System.out.println(Math.pow(num, 3));
				break;
			case 3: 
				System.out.println(Math.sqrt(num));
			default:
				break;
			}
		}
		
		sc.close();
	}

}
