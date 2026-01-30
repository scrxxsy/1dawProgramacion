package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio1Parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Object> lista = new ArrayList<Object>();

		lista.add(1);
		lista.add("Hola");
		lista.add(Math.random()*10+1);
		lista.add(new Libro ("Hola como estas", "Bocadillos Extravagantes", false));
		lista.add(20);
		lista.add(21);
		lista.add(22);
		Libro miLibro = new Libro("Don Quijote", "Miguel de Cervantes", true);
		lista.add(miLibro);
		
		if(lista.contains("Hola")) {
			System.out.println("Si contiene la cadena \"Hola\"");
		}
		else {
			System.out.println("No contiene la cadena \"Hola\"");
		}
		
		System.out.println("¿La lista contiene el número 22? " + (lista.contains(22) ? "Si" : "No"));
		
		if(lista.contains(10)) {
			System.out.println("Si contiene el número 10");
		}
		else {
			System.out.println("No contiene el número 10");
		}
		
		if(lista.contains(new Libro ("Hola como estas", "Bocadillos Extravagantes", false))) {
			System.out.println("Si contiene el libro");
		}
		else {
			System.out.println("No contiene el libro");
		}
		if(lista.contains(miLibro)) {
			System.out.println("Si, contiene El Quijote");
		}
		else {
			System.out.println("No, contiene El Quijote");
		}
		System.out.print(lista);

	}

}
