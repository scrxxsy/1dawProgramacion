package ej1_9;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Realizar un programa que genere y almacene en un array 20 números de forma aleatoria. A 
		continuación deberá mostrar el array con los números generados, así como mostrar (junto con su 
		posición en el array), contar y sumar los elementos pares que ocupan las posiciones impares. 
		 */
		
		int [] array= new int[20];
		int contpares= 0, sumapares=0;
		
		for (int i = 0; i<array.length; i++) {
			array[i] = (int)(Math.random()*20)+1;
			System.out.print(array[i] + " ");
			
			
			
		}
		
		for (int b = 0; b<array.length; b++) {
			if(array[b]%2==0 && b%2!=0) {
				contpares++;
				
				
				System.out.println("Elemento: " + array[b] + "," + " posicion: " + b);
				
				sumapares+= array[b];
			}
		}
		System.out.println("\nTotal pares: " + contpares);
		System.out.println("Suma de los valores pares: " + sumapares);
		
		
		
		

	}

}
