package juego7Media_Ej18;

import java.util.Objects;

/**
 * Clase que guardará la información de un objeto de tipo
 * 		-Valor de carta --> 1 a 10 (1 a 7, cartas de 1 a 7, 8-sota, 9-caballo, 10-Rey)
 * 		-Palo de la carta --> Oros, Copas, Bastos, Espadas
 */

public class Carta {

	/**
	 * Variables de instancia
	 */
	
	private EnumPalo palo;
	private int valor;
	
	/**
	 * Constructor
	 * @param palo
	 * @param valor
	 */
	
	public Carta(EnumPalo palo, int valor) {
		this.palo = palo;
		this.valor = valor;
	}

	
	
	/**
	 * Getter's y Setter's
	 */
	
	public EnumPalo getPalo() {return palo;}
	public int getValor() {return valor;}

	public void setPalo(EnumPalo palo) {this.palo = palo;}
	public void setValor(int valor) {this.valor = valor;}
	
	@Override
	public String toString() {
		String cad = switch (this.valor){
		case 1,2,3,4,5,6,7 -> {yield this.valor + " de " + this.palo;}
		case 8 -> {yield "Sota de " + this.palo;}
		case 9 -> {yield "Caballo de " + this.palo;}
		case 10 -> {yield "Bastos de " + this.palo;}
		default -> {yield "Carta no válida";}
		};
		
		return cad;
	}
	
	/**
	 * Método que devuelve la puntuación real de la carta para el juego de la 7 y media
	 * 
	 * @return --> 1 a 7 si el valor de la carta es de 1 a 7
	 * 		   -->0.5 si el valor de la carta es de  8 , 9 o 10
	 */
	
	public float getPuntos7Media() {
		if (this.valor >=7) {
			return this.valor;
		}
		else {
			return 0.5f;
		}
	}



	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}

	/**
	 * Redefinición de equals	
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return palo == other.palo && valor == other.valor;
	}
	
	
	
}
