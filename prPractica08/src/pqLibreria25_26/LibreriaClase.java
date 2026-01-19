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
				System.out.print("Introduzca el elemento de la posición: " + (i+1) + ": ");
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
		
	 // Elemento máximo del array
	    public static int elementoMax(int [] array) {
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max;
	    }

	    // Elemento mínimo del array
	    public static int elementoMin(int [] array) {
	        int min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        return min;
	    }

	    // Suma de los elementos del array
	    public static int sumaElementosArray(int [] array) {
	        int suma = 0;
	        for (int i = 0; i < array.length; i++) {
	            suma += array[i];
	        }
	        return suma;
	    }

	    // Búsqueda lineal
	    public static int busquedaLineal(int [] vector, int numero) {
	        for (int i = 0; i < vector.length; i++) {
	            if (vector[i] == numero) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    // Búsqueda dicotómica
	    public static int busquedaDic(int [] vector, int numero) {
	        int primero = 0, ultimo = vector.length - 1, mitad;
	        boolean encontrado = false;

	        while (!encontrado && primero <= ultimo) {
	            mitad = (primero + ultimo) / 2;

	            if (vector[mitad] == numero) {
	                return mitad;
	            } else if (vector[mitad] < numero) {
	                primero = mitad + 1;
	            } else {
	                ultimo = mitad - 1;
	            }
	        }

	        return -1;
	    }

	    // Ordenación burbuja
	    public static void ordenacionBurbuja(int [] array) {
	        int aux;
	        boolean ordenado = false;
	        int i = 1;

	        while (i < array.length && !ordenado) {
	            ordenado = true;
	            for (int j = array.length - 1; j >= i; j--) {
	                if (array[j] < array[j - 1]) {
	                    aux = array[j];
	                    array[j] = array[j - 1];
	                    array[j - 1] = aux;
	                    ordenado = false;
	                }
	            }
	            i++;
	        }
	    }

	    // Ordenación selección
	    public static void ordenarSeleccion(int [] array) {
	        int pos_menor, menor;
	        for (int i = 0; i < array.length - 1; i++) {
	            pos_menor = i;
	            menor = array[i];
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[j] < menor) {
	                    pos_menor = j;
	                    menor = array[j];
	                }
	            }
	            array[pos_menor] = array[i];
	            array[i] = menor;
	        }
	    }

	    // Ordenación inserción
	    public static void ordenarInsercion(int [] array) {
	        int aux, j;
	        for (int i = 1; i < array.length; i++) {
	            aux = array[i];
	            j = i - 1;
	            while (j >= 0 && array[j] > aux) {
	                array[j + 1] = array[j];
	                j--;
	            }
	            array[j + 1] = aux;
	        }
	    }

	    // Ordenación Shell
	    public static void ordenarShell(int [] array) {
	        int salto = array.length / 2;
	        int aux;
	        while (salto > 0) {
	            for (int i = salto; i < array.length; i++) {
	                aux = array[i];
	                int j = i;
	                while (j >= salto && array[j - salto] > aux) {
	                    array[j] = array[j - salto];
	                    j -= salto;
	                }
	                array[j] = aux;
	            }
	            salto /= 2;
	        }
	    }

	    // Desordenar array
	    public static void desordenarArray(int [] array) {
	        int pos, aux;
	        for (int i = 0; i < array.length; i++) {
	            pos = (int)(Math.random() * array.length);
	            aux = array[i];
	            array[i] = array[pos];
	            array[pos] = aux;
	        }
	    }

	    // Insertar por posición
	    public static void insertarPos(int [] array, int pos, int elemento) {
	        for (int i = array.length - 1; i > pos; i--) {
	            array[i] = array[i - 1];
	        }
	        array[pos] = elemento;
	    }

	    // Borrar por posición
	    public static void borrarPos(int [] array, int pos) {
	        for (int i = pos; i < array.length - 1; i++) {
	            array[i] = array[i + 1];
	        }
	        array[array.length - 1] = 0;
	    }

	    // Borrar por elemento (primera aparición)
	    public static void borrarElemento(int [] array, int elemento) {
	        int pos = busquedaLineal(array, elemento);
	        if (pos != -1) {
	            borrarPos(array, pos);
	        }
	    }

	    // Borrar todas las apariciones
	    public static void borrarTodos(int [] array, int elemento) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == elemento) {
	                borrarPos(array, i);
	                i--;
	            }
	        }
	    }

	
}
