package prExamen01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
				
		double random1,random2,random3;
		int atletas, cont = 1;
		double max=0;
		
		System.out.println("¿Cuántos atletas participarán en la prueba ?");
		atletas=sc.nextInt();
		

		while (cont<=atletas) {
			
				random1 = (Math.random()*30 + 50);
				random2 = (Math.random()*30 + 50);
				random3 = (Math.random()*30 + 50);
				max=random1;
				System.out.println("Lanzamientos del atleta: " + cont + " " + random1 + " " + random2 +
						" " + random3);
				cont++;
				
				
				
		
			
	
		sc.close();

	}
		
	System.out.println("Mejor lanzamiento " + max + " realizado por atleta " + atletas);
		
		
	
		

	}
}
