package prJuego7yMedia;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego7Media juego = new Juego7Media();
		
		System.out.println(Arrays.deepToString(juego.getBaraja()));
		
		int [] array = {1,2,3,4,5};
			for (int elemento:array) {
				System.out.print(elemento + " ") ;
			}
	}

}
