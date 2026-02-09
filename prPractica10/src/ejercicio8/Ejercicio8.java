package ejercicio8;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> listaNumSinRepetir = new TreeSet<>();
		
		do {
			listaNumSinRepetir.add((int)(Math.random()*50)+1);
		}
		while(listaNumSinRepetir.size()!=50);
		
		System.out.println(listaNumSinRepetir);
	}

}
