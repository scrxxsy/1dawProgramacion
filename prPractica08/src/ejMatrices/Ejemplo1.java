package ejMatrices;

public class Ejemplo1 {
	public static void main (String[] args) {
	int [][] matriz = new int [6] [8];
	
	//Rellenamos la matriz con valores aleatorios
	
	for (int filas=0; filas < matriz.length; filas++) {
		for (int col = 0; col < matriz[filas].length; col++) {
			
			matriz[filas][col] = (int)(Math.random()*100);
			
		}
		
	}
	
	for (int filas=0; filas < matriz.length; filas++) {
		for (int col = 0; col < matriz[filas].length; col++) {
			
			System.out.print(matriz[filas][col] + "\t");
		}
		System.out.println();
	}
	
	}
}
