package prPractica01;

public class PruebaDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividendo = 18;
		int divisor = 0;
		
		//System.out.println("División: " + (divisor==0? "Error" : dividendo/divisor));
		
		
	//Control de excepciones
		try { // El código que está dentro del bloque tru está vigilando
			System.out.println("Buenas tardes");
			
			System.out.println("División: " + (dividendo/divisor)) ;
			
			System.out.println("Fin del bloque try");
		}
		catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
		}
		finally {
			System.out.println("Este código siempre se va a ejecutar");
		}
		System.out.println("Fin del programa");
	}
}
