package prPruebas;

public class EjConcicionalBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=99;
		
		if (num==100) 
			System.out.println("El número es 100");
	
		else 
			System.out.println("El número no es 100");
		
					
		System.out.println("Fin del programa");
		

		if (num==100) {
			System.out.println("El número es 100");
		}
		else { 
			System.out.println("El número no es 100");
		}
		
		
		if (num==100) {
			System.out.println("El número es 100");
			System.out.println("Hasta luego");
		}
		else { 
			System.out.println("El número no es 100");
			System.out.println("El número es:" + num);
			System.out.println("Adios");
		}
		
		System.out.println("Fin del programa");
	       System.out.println("\u001B[30mTexto en rojo\u001B[0m");
	}

}

