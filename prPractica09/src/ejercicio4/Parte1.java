package ejercicio4;

public class Parte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Crea un objeto de tipo String que contenga varias palabras 
	String cad = "Tiene la Tarara un vestido blanco que sólo se pone en el"+
	"Jueves Santo";
	
	String cad2 = "Chupala Alberto";
	
		
	//Averigua la longitud de la cadena. 
	
	System.out.println("Longirud de la caden: " + cad.length());
	System.out.println("Hola".length());

	
	//Muestra el carácter que se encuentra en la posición 2 de tu cadena. 
	System.out.println("Carácter de la 2ª posición: " + cad.charAt(1));
	System.out.println("Carácter de la 2ª posición: " + cad.toCharArray()[1]);
	
	//Mostrar todas las vocales de una cadena. 
	System.out.println("Vocales de la cadena: ");
	char letraChar;
	String letraString;
	
	for(int cont=0; cont<cad.length(); cont++) {
		letraChar = cad.charAt(cont);
		
		letraString = Character.toString(letraChar);
		
		if(letraString.matches("[aAeEiIoOuU]")) {
			System.out.print(letraChar + " ");
		}
		
	}
	
	//Extraer la penúltima letra de una cadena. 
	System.out.println("Penúltimo carácter: " + cad.charAt(cad.length()-2));
	//Extrae y almacena en otro objeto del mismo tipo toda la cadena excepto los 2 primeros caracteres 
	//(subcadena). 
	System.out.println("Todos los caracteres menos los dos primeros: " + cad2.substring(2));
	
	
	//Extrae y almacena en otro objeto del mismo tipo toda la cadena excepto los 2 primeros caracteres y 
	//los dos últimos caracteres. 
	System.out.println("Todos los caracteres menos los 2 primeros y los 2 últimos: " + cad2.substring(2, cad2.length()-2));
	
	//Modifica en la cadena anterior todas las veces que aparezca la vocal ‘a’ (minúscula) por  ‘A’ 
	//(mayúscula).
	
	System.out.println("Sustituir la a minúscula por la A mayúscula: " + cad2.replace("a", "A"));
	
	}

}
