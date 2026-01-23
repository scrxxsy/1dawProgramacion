package prPractica09;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int random = (int)(Math.random()*25)+1;
		System.out.println(random);
		
		double raiz13 = Math.cbrt(13);
		double raiz125 = Math.cbrt(125);
		
		System.out.println(raiz13);
		System.out.println(raiz125);
		
		System.out.println("Resto de 10 entre 3" + Math.IEEEremainder(10, 3));
		
		System.out.println();
		System.out.println(Math.signum(10));
		System.out.println(Math.signum(-8));
		System.out.println(Math.signum(0));
		
		System.out.println(Math.hypot(7, 24)); 
		
	}
	

}
