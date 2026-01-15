package prPruebas;

import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayPrimitivo = {1,2,3,4,5};
		
		Integer [] arrayObjetoInteger = new Integer[5];
		
		for (int cont=0; cont<arrayObjetoInteger.length; cont++) {
			arrayObjetoInteger[cont] = Integer.valueOf(arrayPrimitivo[cont]);
		}
		
		System.out.println(Arrays.toString(arrayPrimitivo));
		System.out.println(Arrays.toString(arrayObjetoInteger));
	}

}
