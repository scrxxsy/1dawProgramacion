package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio1Parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Object> lista = new ArrayList<Object>();

		lista.add(1);
		lista.add("Hola como estas");
		lista.add(Math.random()*10+1);
		lista.add(new Libro ("Hola como estas", "Bocadillos Extravagantes", false));
		lista.add(20);
		lista.add(21);
		lista.add(22);
		Libro miLibro = new Libro("Don Quijote", "Miguel de Cervantes", true);
		lista.add(miLibro);
		
		if(lista.remove("Hola como estas"))
			System.out.println("Hola ha sido borrado");
		else
			System.out.println("Hola no se ha podido borrar");
		
		if(lista.remove(20))
			System.out.println("El número 20 ha sido borrado");
		else
			System.out.println("El número 20 no se ha podido borrar");
		

		
		System.out.println("\nLista tras borrado de varios elementos");
		
		for (Object elem : lista) {
			System.out.println(elem);
			
		}
}	
		
}
