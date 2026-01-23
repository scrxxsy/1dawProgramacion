package prPractica09;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int num = rand.nextInt(20);
		
		System.out.println(num);
		
		System.out.println(System.nanoTime());
		
		System.out.println(rand.getClass().getSimpleName());
		System.out.println(rand.getClass().getPackageName());
		
		
		if (rand instanceof Random) {
			System.out.println("El objeto pertenece a la clase random");
		}
		else {
			System.out.println("El objeto no pertenece a la clase random");
		}
		
	}

}
