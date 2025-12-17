package pqLibreria25_26;

import java.util.Scanner;

public class TestLibClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte opcion;
		int [] miArray = new int [10];
		
		
		Scanner sc = new Scanner(System.in);
			
		do {
			opcion = menu(sc);
			
			switch (opcion) {
			
			case 1 -> LibreriaClase.(miArray, sc);
			case 2 -> LibreriaClase.cargaElementosAleatorios(sc);
			case 4 -> System.out.println(ob.elementoMax());
			case 5 -> System.out.println(ob.elementoMin());
			case 6 -> System.out.println(ob.sumaElementosArray());
			
			
			}
		}
		while(opcion!=17);
		
		sc.close();
}
	

	
	public static byte menu(Scanner sc) {
		
		byte opcion;
		System.out.println("\n --- MENU DE OPERACIONES ---");
		System.out.println("1.- Carga de datos desde teclado");
		System.out.println("2.- Carga de datos aleatoria");
		System.out.println("3.- Mostrar array");
		System.out.println("4.- Valor máximo del array");
		System.out.println("5.- Valor mínimo del array");
		System.out.println("6.- Suma de los elementos del array");
		System.out.println("7.- Insertar por posición");
		System.out.println("8.- Borrar por posición");
		System.out.println("9.- Borrar buscando el número");
		System.out.println("10.- Búsqueda lineal");
		System.out.println("11.- Búsqueda binaria o dicotómica");
		System.out.println("12.- Ordenación por el método de la burbuja");
		System.out.println("13.- Ordenación por el método de inserción");
		System.out.println("14.- Ordenación por el método de selección");
		System.out.println("15.- Ordenación por el método de Shell");
		System.out.println("16.- Desordenar array");
		System.out.println("17.- Salir");
		System.out.print("\nIntroduzca la opcion: ");
		opcion=sc.nextByte();
		
		return opcion;

		}

	}