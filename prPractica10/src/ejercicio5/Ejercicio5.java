package ejercicio5;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-------------------------------------
		//Creacion de varios mapas HashMap y LinkedHashMap
		//-------------------------------------
		
		Map<String, String> dic = new HashMap<String, String>();
		
		dic.put("coche", "car");
		dic.put("ordenador", "computer");
		dic.put("bolígrafo", "pen");
		dic.put("patalla", "screen");
		dic.put("libro", "book");
		dic.put("caballo", "horse");
		dic.put("copa", "cup");
		dic.put("cerdo", "pig");
		
		System.out.println(dic);

		Map<String, String> dic2 = new LinkedHashMap<>();
		dic2.put("coche", "car");
		dic2.put("ordenador", "computer");
		dic2.put("bolígrafo", "pen");
		dic2.put("patalla", "screen");
		dic2.put("libro", "book");
		dic2.put("caballo", "horse");
		dic2.put("copa", "cup");
		dic2.put("cerdo", "pig");
		
		System.out.println(dic2);
		System.out.println("Traducción de casa: " + dic.get("libro"));
		System.out.println("Traducción de cerdo: " + dic2.get("cerdo"));

		//----------------------------------------------------------------
		//Crea un mapa a partir de otro ya creado, por ejemplo un TreeSet, 
		//a partir de un HashMap, o bien con la ayuda del método putAll. 
		//----------------------------------------------------------------
		
		SortedMap<String,String> dic3 = new TreeMap<>(dic);
		System.out.println(dic3);
		
		SortedMap<String,String> dic4 = new TreeMap<>();
		dic4.putAll(dic);
		dic4.put("mesa", "table");
		dic4.put("portatil", "portátil");
		dic4.put("ordenador", "computer");
		System.out.println(dic4);
		
		if(dic4.put("ordenador", "computer").equals("computer")) {
			System.out.println("Clave repetida");
		}
		else {
			System.out.println("Elemento añadido");
		}
		System.out.println(dic4);
		
		//--------------------------------------------------------------------------------
		//Prueba a crear un diccionario donde las claves estén ordenadas de forma inversa, 
		//prueba con clases anónimas y con expresiones lambda.
		//--------------------------------------------------------------------------------
		
		SortedMap <String,String> dic5 = new TreeMap<>(new OrdenarStringDescendente());
		dic5.putAll(dic4);
		
		System.out.println("Diccionario 5 (orden descendente): " + dic5);
		
		
		
		
	}

}
