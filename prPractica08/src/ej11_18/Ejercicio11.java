package ej11_18;

import java.util.Scanner;



public class Ejercicio11 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    int[] pol1 = cargaPolinomio(sc);
	    int[] pol2 = cargaPolinomio(sc);
	    int[] polResultado;

	    byte opcion;

	    do {
	    	System.out.println("Polinomio 1 ");
	    	mostrar(pol1);
	    	
	    	System.out.println("\nPolinomio 2 ");
	    	mostrar(pol2);
	    	
	        opcion = menu(sc);

	        switch (opcion) {

	        case 1:
	            System.out.println("SUMA DE POLINOMIOS:");
	            polResultado = sumaPolinomios(pol1, pol2);
	            mostrar(polResultado);
	            break;

	        case 2:
	            System.out.println("RESTA DE POLINOMIOS (aún no implementada)");
	            break;

	        case 3:
	            System.out.println("MULTIPLICACIÓN DE POLINOMIOS (aún no implementada)");
	            break;

	        case 4:
	            System.out.println("Saliendo del programa...");
	            break;
	            
	         

	        default:
	            System.out.println("Opción no válida.");
	        }

	    } while (opcion != 4);

	    sc.close();
	}


		
	
	public static int[] cargaPolinomio(Scanner sc) {
		int grado;
		
		
		System.out.print("Introduzca el grado del polinomio: ");
		grado = sc.nextInt();
		
		
		int [] poli = new int [grado+1];
		
		
		for(int cont = grado; cont >=0; cont--) {
			System.out.print("Introduzca el valor del polinomio de grado " + cont + ": ");
			poli[cont] = sc.nextInt();
		}
		
		System.out.println();
		
		return poli;
	}

	public static void mostrar(int [] array) {
		for (int cont = array.length-1; cont>=0; cont--) {
			System.out.print(array[cont] + "x^" + cont + " ") ;
		}
	}

	
	public static int[] sumaPolinomios(int [] array1, int [] array2) {
		int[] polResultado = new int [Math.max(array1.length, array2.length)];
		
			for (int cont1 = 0; cont1<=array1.length; cont1++) {
				for (int cont2 = 0; cont2<=array2.length; cont2++) {
					polResultado[cont2] = array1[cont1] + array2[cont2];
				}
			}
			return  polResultado;
	}

	

	public static void restaPolinomios() {

	}

	public static void multiplicacionPolinomios() {

	}


	public static byte menu(Scanner sc) {

		byte opcion;
		System.out.println("\n --- MENU DE OPERACIONES ---");
		System.out.println("1.-Suma de dos polinomios de grado N y M.");
		System.out.println("2.-Resta de dos polinomios de grado N y M. ");
		System.out.println("3.-Multiplicación de dos polinomios de grado N y M.");
		System.out.println("4.-Salir.	");
		opcion=sc.nextByte();

		return opcion;

	}
	


}

