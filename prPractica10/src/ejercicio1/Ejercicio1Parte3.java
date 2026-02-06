package ejercicio1;


import java.util.*;


public class Ejercicio1Parte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(100);
		lista.add(59);
		lista.add(23);
		lista.add(34);
		

		System.out.println(lista);
		
		System.out.println(lista.contains(100)? "Si contiene el número 100" : "No contiene el número 100");
		System.out.println(lista.contains(200)? "Si contiene el número 200" : "No contiene el número 200");
	
		
		for (int cont = 0; cont<lista.size(); cont++) {
			System.out.println(lista.get(cont) + " ");
		}
		
		lista.sort(null);
		
		
		//Collections.sort(lista); 
		
		System.out.println(lista);
		
		
		
	}

}
