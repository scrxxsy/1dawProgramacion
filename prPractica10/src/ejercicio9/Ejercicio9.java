package ejercicio9;


import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Crea un diccionario de términos informáticos y su definición, con la ayuda de las colecciones. El diccionario 
//		deberá estar ordenado por clave de forma alfabética. Para probarlo, pide al usuario un término y 
//		muéstrale su definición.
		
		SortedMap <String,String> dic = new TreeMap<>();
		String cad = " ";
		String seguir = " ";
		
		
		try(Scanner sc = new Scanner (System.in)){
			
			dic.put("hardware","parte física del ordenador");
			dic.put("software", "programa del propio ordenador");
			dic.put("ram", "memoria principal del ordenador");
			dic.put("cpu", "cerebro del ordenador");
			
		
			
			System.out.println(dic);
			
			System.out.println("Búsqueda de términos");
			
			do {
				System.out.println("Introduzca el término a buscar: ");
				cad = sc.nextLine();
				
				if(dic.get(cad.toLowerCase())!= null) {
					System.out.println(dic.get(cad.toLowerCase()));
					System.out.println("¿Quieres seguir buscando?");
					seguir = sc.nextLine();
					
				}
				
				else {
					System.out.println("Término no encontrado");
					System.out.println("¿Quieres seguir buscando?");
					seguir = sc.nextLine();
					
				}
				
				
				
			}
			while(seguir.equalsIgnoreCase("s"));
			
			
			
			
			
		}
		
		

	}

}
