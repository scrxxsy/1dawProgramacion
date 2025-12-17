package pqLibreria25_26;

import java.util.Scanner;

/**
 * Librería con métodos de clases para manejar arrays, esta
 * librería incluirá los siguientes métodos:
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


public class LibreriaClase {
	public static void cargaElementos(int [] array, Scanner sc) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduzca el elemento de la posición: " + (i+1) + ": ");
			array[i]=sc.nextInt();
		}
		
	}
	
	public static void cargaElementosAleatorios(int [] array, Scanner sc) {
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*20)+1;
		}
		
	}
	
	public static String toString(int [] array) {
        String cadena = "Array: ";
        
        for(int i=0;i<array.length;i++) {
            cadena += array[i]+" ";
        }
        
        return cadena;
    }
    
    
    public static String toString2(int [] array) {
        String cadena = "Array: ";
        
        for(int i=0;i<array.length-1;i++) {
            cadena += array[i]+", ";
        }
        
        cadena += array[array.length-1];
        
        return cadena;
    }
	
}
