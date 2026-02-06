package ejercicio2;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		//--------------------------------------------------------------
		// Definir una colección tipo List, y añadirle varios elementos
		//--------------------------------------------------------------
		List<String> miLista = new LinkedList<>();
		
		miLista.add("Hola");
		miLista.add("Me encanta el color amarillo");
		miLista.add("Hasta luego");
		miLista.add("Payuni");
		miLista.add("Bocadillos Extravagantes");
		
		System.out.println(miLista);
		
		//--------------------------------------------------------------
		// Recorrer la lista de diferentes formas
		//--------------------------------------------------------------
		
		//Recorrerla con iterator
		
		for (Iterator<String> it = miLista.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
		Iterator<String> it = miLista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (String elem : miLista) {
			System.out.println(elem);
		}
		
		//Con ListIterator
		
		for (ListIterator<String> li = miLista.listIterator(miLista.size()); li.hasPrevious();)
			System.out.print(li.previous() + " ");
		
		//Con ListIterator, modificando cada cadenaa mayúscula
		ListIterator<String> li = miLista.listIterator(miLista.size());
		
		
		while(li.hasPrevious()) {
			li.set(li.previous().toUpperCase());
		}
		
		System.out.println(miLista);
		
		//--------------------------------------------------------------
		// Averigua el número de elementos de tu lista. 
		// Prueba a mostrar distintos elementos de la lista, por ejemplo, el primero, el último, el que ocupa la 
		// cuarta posición, ... 
		//--------------------------------------------------------------
		
		System.out.println("Número de elementos de la lista: " +  miLista.size());
		System.out.println("Primer elemento de la lista: " + miLista.getFirst());
		System.out.println("Primer elemento de la lista: " + miLista.get(0));
		System.out.println("Último elemento de la lista: " + miLista.getLast());		
		System.out.println("Último elemento de la lista: " + miLista.get(miLista.size()-1));	
		System.out.println("Cuarto elemento de la lista: " + miLista.get(3));
		System.out.println("Elemento primero: " + miLista.p);
		
		//--------------------------------------------------------------
		// De forma análoga, prueba a borrar determinados elementos tanto con el método remove de la 
		// interfaz List, como con el de la interfaz Iterator.
		//--------------------------------------------------------------
		
		if(miLista.remove("HOLA"))
			System.out.println("Hola ha sido borrado");
		else
			System.out.println("Hola no ha podido ser borrado");
		
		if(miLista.remove("Tormenta"))
			System.out.println("Tormenta ha sido borrada");
		else 
			System.out.println("Tormenta no ha sido borrada");
		
		// Borrado con el método remove de Iterator
		
		for (Iterator<String> it2 = miLista.iterator(); it2.hasNext();) {
			if (it2.next().equalsIgnoreCase("Hola")) {
				it2.remove();
			}
		}
			
		System.out.println("Lista tras el borrado de Hola" + miLista);
		
		System.out.println("Elemento primero: " + (LinkedList<String>)miLista));
	}
	
	

}
