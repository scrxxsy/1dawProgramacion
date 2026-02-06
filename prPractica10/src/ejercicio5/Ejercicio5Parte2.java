package ejercicio5;

import java.util.*;



public class Ejercicio5Parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dic = new HashMap<String, String>();
		
		dic.put("coche", "car");
		dic.put("ordenador", "computer");
		dic.put("bolígrafo", "pen");
		dic.put("pantalla", "screen");
		dic.put("LIBRO", "BOOK");
		dic.put("caballo", "horse");
		dic.put("copa", "cup");
		dic.put("cerdo", "pig");
		
		//Obtén las claves de alguno de los diccionarios que has creado
		// y alamacénalas en un Sey
		
		Set<String> claves = dic.keySet();
		System.out.println(claves);
		
		for (String elem: claves) {
			System.out.println(elem + " - " + dic.get(elem));
		}
		
		//Idem al anterior, pero queremos las claves ordenadas
		
		SortedSet<String> claves2 = new TreeSet<>(dic.keySet());
		
		System.out.println(claves2);
		
		//Idem al anterior, pero queremos las claves ordenadas, independientemente si es mayúscula 
		//o minúscula
		SortedSet<String> claves2orden = new TreeSet<String>((o1,o2) -> o1.compareToIgnoreCase(o2));
		claves2orden.addAll(dic.keySet());
		
		System.out.println(claves2orden);
		
		//Crea otra colección con los valores del mapa, por ejemplo, en un LinkedList, y ordénalos.
		
		LinkedList<String> valores = new LinkedList<>(dic.values());
		System.out.println(valores);
		
		Collection<String> valores2 = new LinkedList<>(dic.values());
		System.out.println(valores2);

		
		SortedSet<String> valores3 = new TreeSet<>(dic.values());
		System.out.println(valores3);
		
		
		
		
	}

}
