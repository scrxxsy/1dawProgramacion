package ejercicio4;

public class Parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad2;
		String cad = "Tiene la Tarara un vestido blanco que sólo se pone en el"+
				" Jueves Santo";
				
		
//		• Crea un array de caracteres cuyos elementos serán los de la cadena anterior. 
		char [] arrayCaracteres =cad.toCharArray();
		
		for (int cont = 0; cont<arrayCaracteres.length; cont++) {
			System.out.print(arrayCaracteres[cont]);
		}
		System.out.println();
		
//		• Convierte la subcadena que creaste anteriormente a mayúscula, y que se quede modificada 
//		internamente, es decir, no solo a la hora de imprimirla. 
		cad2=cad.toUpperCase();
		System.out.println(cad2);
		
//      Sacar la palabra "blanco" a un array con el método getChars y sybstring
		try {
			int longPalabra = "blanca".length();
			
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Palabra no encontrada");
			System.out.println(e.getMessage());
		}
//		• Comprueba si la cadena empieza por la palabra “Hola”. 
		if(cad.startsWith("Hola") == false) {
			System.out.println("No empieza por hola");
		}
		else {
			System.out.println("Si empieza por hola");
		}
//		• Busca una subcadena que exista dentro de tu cadena, y otra que no exista (indexOf), recordad que 
//		en la cadena original la letra ‘a’ se había cambiado a mayúscula. 
		System.out.println(cad.indexOf("un vestido blanco"));
		System.out.println(cad.indexOf("Polla"));
		System.out.println(cad.contains("un vestido blanco")? "Si está" : "No está");
		System.out.println(cad.contains("un vestido nigga")? "Si está" : "No está");
//		• Busca todas las ocurrencias de una cadena. 
		
		
//		• Extrae de tu cadena la segunda palabra y almacénala en una nueva cadena. 
//		• A partir de un array de caracteres crea un objeto de tipo cadena. 
//		• Muestra el valor Unicode de cada uno de los caracteres de la cadena anterior (codePointAt). 
//		• Crea un objeto de tipo StringBuffer, y prueba diferentes formas de concatenación con el método 
//		Append. 
//		• Insertar al objeto anterior una subcadena, a partir de la posición 7. 
//		• A partir de un array de tipo byte que contiene números de un dígito, y con la ayuda del método 
//		reverse de la clase StringBuffer, invierte el citado array.
	}

}
