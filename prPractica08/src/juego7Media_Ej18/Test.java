package juego7Media_Ej18;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//------------------------------------------------
		//Prueba de la clase carta
		//------------------------------------------------
		
		Carta c1 = new Carta(EnumPalo.OROS, (byte)10);
		System.out.println(c1);
		System.out.println("Puntuación: " + c1.getPuntos7Media());
		
		System.out.println();
		
		Carta c2 = new Carta(EnumPalo.COPAS, (byte)7);
		System.out.println(c2);
		System.out.println("Puntuación: " + c2.getPuntos7Media());
		
		
		Carta c3 = new Carta(EnumPalo.OROS, (byte)10);
		
		System.out.println();
		
		if(c1.equals(c3)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son distintos");
		}
		
		System.out.println();
		
		if(c1.equals(c2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son distintos");
		}
		
		
		//------------------------------------------------
		//Prueba de la clase Baraja
		//------------------------------------------------
	
		Baraja miBaraja = new Baraja();
		System.out.println(miBaraja.toString());
		
		System.out.println("Carta 1 sacada: " + miBaraja.sacaCarta().toString());
		System.out.println("Carta 2 sacada: " + miBaraja.sacaCarta());
		System.out.println("Carta 3 sacada: " + miBaraja.sacaCarta());
		
		System.out.println(miBaraja.toString());
		System.out.println("**********************	");
		for(Carta elemento : miBaraja.getMiBaraja()) {
			System.out.println(elemento.toString());
		}
	}

}
