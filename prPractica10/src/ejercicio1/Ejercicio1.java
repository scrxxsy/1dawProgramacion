package ejercicio1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crear una colección tipo Collection, en la colección vamos a guardar de todo un poco, así que la
//		parametrizaremos a Object. A continuación, realiza las siguientes acciones sobre este objeto
		
		Collection <Object> lista = new ArrayList<Object>();
		
		lista.add(1);
		lista.add("Hola");
		lista.add(Math.random()*10+1);
		lista.add(new Libro ("Hola como estas", "Bocadillos Extravagantes", false));
		lista.add(20);
		lista.add(21);
		lista.add(22);
		
		System.out.print(lista);
		
		/**
		 * Recorrer la colección con Iterator y bucle while
		 */
		
		Iterator<Object> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Forma 2
		
		for (Object object : lista) {
			System.out.println(object);
		}
		
		
		//Borrar los números enteros de lista
		Iterator<Object> it4 = lista.iterator();
		Object elem;
		while(it4.hasNext()) {
			elem = it4.next();
			if(elem instanceof Integer) {
				it4.remove();
			}
		}
		
		for (Iterator<Object> it5 = lista.iterator(); it5.hasNext();) {
			if(it5.next() instanceof Integer) {
				it5.remove();
			}
		}
		
		boolean encontrado = false;
		Object elem2;
		Libro libroBuscado;
		
		Iterator<Object> it6 = lista.iterator();
		
		while (it6.hasNext() && !encontrado) {
			elem2 = it.next();
			
			libroBuscado= (Libro)elem2;
			
			if (elem2 instanceof Libro) {
			if(libroBuscado.getTitulo().equals("Hola como estas")) {
				libroBuscado.setTitulo(libroBuscado.getTitulo().toUpperCase());
				encontrado = true;
			}
			}
			
		
			
			
		}
		System.out.println("\n\n* * Colección tras modificación de un libro");
		for (Object object : lista) {
			System.out.println(object);
		}
			
	}

}
