package pqLibreria25_26;

import java.util.Scanner;

/**
 * Librería con métodos de objeto para manejar arrays, el array con el 
 * que trabajaremos será variable de instancia.
 * 
 * Esta librería incluirá los siguientes métodos:
 *    - Carga de datos de teclado
 *    - Carga de datos aleatoria
 *    - toString
 *    - Elemento máximo del array
 *    - Elemento mínimo del array
 *    - Suma de los elementos del array
 *    - Métodos de búsqueda (lineal y dicotómica o binaria)
 *    - Métodos varios de ordenación (burbuja, selección, inserción y Shell)
 *    - Método que desordene el array
 *    - Método de insertar por posición
 *    - Método de borrar por posición
 *    - Método de borrar por elemento
 *    - Método para borrar todas las apariciones de un elemento
 * 
 * @author Ángel Rodríguez Córdoba
 *
 */

public class LibreriaObjeto {
	
	private static final int tamanioDefecto = 10;
	/**
	 * Variables de instancia
	 */
	
	private int [] array;

	
	
	/**
	 * Constructor
	 */
	
	public LibreriaObjeto(int numElementos) {
		this.array = new int[numElementos];
	}
	
	
	public LibreriaObjeto() {
		this(tamanioDefecto);
	}

	/**
	 * Getter's y Setter's
	 * @return
	 */
	public static int getTamaniodefecto() {
		return tamanioDefecto;
	}


	public int[] getArray() {
		return array;
	}


	public void setArray(int[] array) {
		this.array = array;
	}
	
	/**
	 * Método carga 
	 */
	
	public void cargaElementos(Scanner sc) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduzca el elemento de la posición: " + (i+1) + ": ");
			array[i]=sc.nextInt();
		}
		
	}
	
	
	/**
	 * Método de carga aleatoria
	 */
	
	public void cargaElementosAleatorios() {
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*20)+1;
		}
		
	}
	
	/**
	 * Redefinición del método toString
	 */
	
	@Override
	
	public String toString() {
		String cadena = "Array: ";
		
		
		
		for (int i=0; i<array.length; i++) {
			if(i!=(array.length -1)) {
			cadena = cadena + array[i] + ", ";
			}
			else {
				cadena = cadena + array[i];
			}
			}
			
		
		return cadena;
	}
	
	
	/**
	 * Método sacar elemento maximo de array
	 */
	
	public int elementoMax() {
		int max=0;
		
		for(int i=0; i<array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		
		return max;
	}
	
	
	/**
	 * Método sacar el elemento minimo de array
	 */
	public int elementoMin() {
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if (array[i]<min) {
				min=array[i];
			}
		}
		
		return min;
	}
	
	/**
	 * Método para sumar elementos de array
	 */
	
	public int sumaElementosArray() {
		int suma = 0;
		
		for (int i = 0; i<array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	
	/**
	 * Métodos de búsqueda (lineal)
	 */
	
	
	
	
	/**
	 * Métodos de ordenación
	 */
	
	public void ordenacionArray(int [] array) {
		
		int i=1, aux; 
		boolean ordenacion=false; 
		while(i<array.length && ordenacion == false){ 
			
			ordenacion = true; 
			for(int j=array.length-1; j>=i; j--){ 
				if(array[j]<array[j-1]){ 
					aux=array[j]; 
					array[j]=array[j-1]; 
					array[j-1]=aux; 
					ordenacion = false; 
				} 
			} 
			i++; 
		} 
	} 
	
	/**
	 * Método ordenación (Selección)
	 */
	
	public static void ordenarSeleccion(int [] array){ 
		int pos_menor, menor; 
		for(int i=0; i<=array.length-2; i++){ 
			pos_menor=i; 
			menor = array[i]; 
			for(int j= i+1; j<=array.length-1; j++){ 
				if(array[j]<menor){ 
					pos_menor = j; 
					menor = array[j]; 
				} 
			} 
			array[pos_menor]=array[i]; 
			array[i]=menor; 
		} 
	} 
	
	/**
	 * Método de ordenación 
	 */
}
