package LibreriaMatematica;

import java.util.InputMismatchException;
import java.util.Scanner;



public class TestMenuLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte op;
		Scanner sc = new Scanner (System.in);
		do {
			menu();
			try {
				System.out.print("\tElija una opción (1..8): ");
				op=sc.nextByte();
				switch (op) {
				case 1 -> proceso1(sc);
				case 2 -> proceso2(sc);
				case 3 -> proceso3(sc);
				case 4 -> proceso4(sc);
				case 5 -> proceso5(sc);
				case 6 -> proceso6(sc);
				case 7 -> proceso7(sc);
				case 8 -> System.out.println("\n\t===============" +
						"\n\tFIN DE PROGRAMA"+
						"\n\t===============");

				default -> System.out.println("\n=================" +
						"\nOPCIÓN INCORRECTA" +
						"\n=================");

				}

			}
			catch (InputMismatchException e) {
				System.out.println("\n========================================="
						+ "\nERROR, DEBES INTRODUCIR UN VALOR NÚMERICO" +
						"\n=========================================");
				sc.next();
				op = -1; 
			}

		}
		while (op!=8);

		sc.close();
	}

	public static void menu() {
		System.out.println("\n==OPCIONES LIBRERIA MATEMÁTICA==" + 
				"\n1.Calcular el factorial de un número." + 
				"\n2.Mostrar el combinatorio de dos números dados." +
				"\n3.Visualizar los números primos entre dos números dados." +
				"\n4.Visualizar por pantalla los números perfectos que hay entre 2 números dados." +
				"\n5.Visualizar por pantalla las parejas de números amigos que hay entre 2 números dados." +
				"\n6.Comprobar si dos números son primos entre sí" +
				"\n7.Calcular la función de Euler de un número" +
				"\n8.Salir" + 
				"\n================================"
				);
	}

	public static void proceso1 (Scanner sc) {
		int num;
		long factorial;
		System.out.println("\n=========" +
				"\nFACTORIAL" + 
				"\n=========");
		System.out.print("\nIntroduzca el número al que realizar el factorial: ");
		num=sc.nextInt();
		factorial = LibreriaMatematica.calcularFactorial(num);

		if(factorial==-1) {
			System.out.println("\n\tNO SE PUEDE REALIZAR EL FACTORIAL DE UN NÚMERO NEGATIVO");
		}

		else {
			System.out.println("\n\tEl factorial de " + "[" + num  + "]" + " es " + factorial);
		}
	}
	public static void proceso2 (Scanner sc) {
		int num1, num2;
		double combinatorio;

		System.out.println("\n============" +
				"\nCOMBINATORIO" +
				"\n============");

		System.out.print("\nIntroduzca el valor del primer número: ");
		num1=sc.nextInt();

		System.out.print("Introduzca el valor del segundo número: ");
		num2=sc.nextInt();

		combinatorio = LibreriaMatematica.calcularCombinatorio(num1, num2);

		if(combinatorio == -1) {
			System.out.println("\n\tNO SE PUEDE CALCULAR EL COMBINATORIO DE NÚMEROS NEGATIVOS");

		}
		else {
			System.out.println("\n\tEl combinatorio de " + "[" + num1 +"]" +" sobre " + "[" + num2 +"]" + " es " + combinatorio) ;
		}




	}

	public static void proceso3 (Scanner sc) {
		int num1, num2;

		System.out.println("\n=================================" +
				"\nNÚMEROS PRIMOS ENTRE UN INTERVALO" +
				"\n=================================");

		System.out.print("\nIntroduzca el valor del primer número: ");
		num1=sc.nextInt();

		System.out.print("Introduzca el valor del segundo número: ");
		num2=sc.nextInt();

		System.out.println();
		for (int cont = num1; cont<=num2; cont++) {
			if(LibreriaMatematica.esPrimo(cont)) {

				System.out.print(" | " +cont);
			}

		}
		System.out.println();




	}

	public static void proceso4 (Scanner sc) {
		int num1, num2;

		System.out.println("\n====================================" +
				"\nNÚMEROS PERFECTOS ENTRE UN INTERVALO" +
				"\n====================================");

		System.out.print("\nIntroduzca el valor del primer número: ");
		num1=sc.nextInt();

		System.out.print("Introduzca el valor del segundo número: ");
		num2=sc.nextInt();
		System.out.println();

		for (int cont = num1; cont<=num2; cont++) {
			if(LibreriaMatematica.esPerfecto(cont)) {
				System.out.print(" | " + cont);
			}
		}
		System.out.println();


	}

	public static void proceso5 (Scanner sc){
		int num1, num2;

		System.out.println("\n============================================" +
				"\nPAREJAS DE NÚMEROS AMIGOS ENTRE UN INTERVALO" +
				"\n============================================");

		System.out.print("\nIntroduzca el valor del primer número: ");
		num1=sc.nextInt();

		System.out.print("Introduzca el valor del primer número: ");
		num2=sc.nextInt();

		System.out.println();
		System.out.println("\t==PAREJAS DE NÚMEROS==");

		for(int cont = num1; cont<num2; cont++) {
			for (int cont2 = cont + 1; cont2<num2; cont2++) {
				if (LibreriaMatematica.esAmigo(cont, cont2)) {
					System.out.println("\t" + cont + " y " + cont2);
				}
			}
		}


	}

	public static void proceso6 (Scanner sc){
		int num1, num2;

		System.out.println("\n===============" +
				"\nPRIMOS ENTRE SÍ" +
				"\n===============");

		System.out.print("\nIntroduzca el valor del primer número: ");
		num1=sc.nextInt();

		System.out.print("Introduzca el valor del segundo número: ");
		num2=sc.nextInt();

		if(LibreriaMatematica.esPrimoEntreSi(num1, num2)) {
			System.out.println("\n\tSon primos entre sí");
		}
		else {
			System.out.println("\n\tNO SON PRIMOS ENTRE SÍ");
		}

	}

	public static void proceso7 (Scanner sc){
		int num;
		int euler;

		System.out.println("\n=====" +
				"\nEULER" +
				"\n=====");

		System.out.print("\nIntroduzca el valor del número: ");
		num=sc.nextInt();

		euler = LibreriaMatematica.calcEuler(num);

		if (euler==-1) {
			System.out.println("\n\tNO SE PUEDE CALCULAR EL EULER DE UN NÚMERO NEGATIVO");
		}
		else {
			System.out.println("\n\tEl euler de " + "[" + num + "]" + " tiene como resultado "  + LibreriaMatematica.calcEuler(num));
		}
	}
}


