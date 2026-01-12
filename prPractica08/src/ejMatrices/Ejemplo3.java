package ejMatrices;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int [10] [11];
		
		//Rellenamos la matriz con valores aleatorios
		
		for (int filas=0; filas < matriz.length; filas++) {
			for (int col = 0; col < matriz[filas].length; col++) {
				
				matriz[filas][col] = (filas+1)*col;
				
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
