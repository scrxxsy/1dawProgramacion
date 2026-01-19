package juego7Media_Ej18;

/**
 * Clase Baraja
 * La baraja la simularemos mediante un array de objetos de tipo Carta,
 * en un principio guardaremos las 40 cartas de forma ordenada,
 * y después las mezclaremos  (desordenar el array o mezclar)
 */

public class Baraja {
	public static final int NUMCARTASBARAJA = 40;
	/**
	 * Variables de instancia
	 */

	private Carta[] miBaraja;
	private byte posProximaCarta;

	/**
	 * Constructor
	 */

	public Baraja() {
		this.posProximaCarta = 0;
		this.miBaraja = new Carta[NUMCARTASBARAJA];
		int contador=0; 

		//Crear un array con los valores de la enumeracion
		EnumPalo [] arrayPalos = EnumPalo.values();


		for (int contPalos=0; contPalos<arrayPalos.length; contPalos++) {	
			for (byte contValor = 1; contValor<=10; contValor++) { //Valor

				this.miBaraja[contador] = new Carta(arrayPalos[contPalos], contValor);

				contador++;

			}
			desordenarArray();
		}
	}


	public  void desordenarArray() {
		Carta cartaAux;
		int aux1, aux2;
		
		for (int cont=1; cont<=100; cont++) {
			aux1 = (int)(Math.random()*NUMCARTASBARAJA); //Genero un valor entre 0 y 39
			aux2 = (int)(Math.random()*NUMCARTASBARAJA); //Genero un valor entre 0 y 39
			
			cartaAux = this.miBaraja[aux1];
			this.miBaraja[aux1] = this.miBaraja[aux2];
			this.miBaraja[aux2] = cartaAux;
		}

	}
	
	/**
	 * Método que saca una carta de la baraja
	 */
	
	
	public Carta sacaCarta() {
		
		Carta cartaSacada = this.miBaraja[this.posProximaCarta];
		this.posProximaCarta++;
		return cartaSacada;
	}
	
	public boolean quedanCartas() {
		
		return this.posProximaCarta < NUMCARTASBARAJA;
	}
	
	/**
	 * Getter's y Setter's
	 */
	public Carta[] getMiBaraja() {
		return miBaraja;
	}


	public byte getPosProximaCarta() {
		return posProximaCarta;
	}


	public void setMiBaraja(Carta[] miBaraja) {
		this.miBaraja = miBaraja;
	}


	public void setPosProximaCarta(byte posProximaCarta) {
		this.posProximaCarta = posProximaCarta;
	}
	
	
	@Override
	
	public String toString() {
		String cad = "Quedan " + (NUMCARTASBARAJA - this.posProximaCarta) + " cartas";
		
		for (int cont=this.posProximaCarta; cont<this.miBaraja.length; cont++){
			cad += "\n" + this.miBaraja[cont].toString();
		}
		return cad;
 	}


	
}	



