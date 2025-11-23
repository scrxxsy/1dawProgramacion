package ejerRectangulo;

public class Rectangulo {
	
	/**
	 * Variables de instancia
	 */
	
	public float ancho;
	public float altura;
	
	/**
	 * Constructores
	 */
	
	public Rectangulo() {
		this.altura=0;
		this.ancho=0;
	}

	public Rectangulo (int lado) {
		this.altura = lado;
		this.ancho = lado;
	}
	
	public Rectangulo (int ancho, int altura) {
		this.altura = altura;
		this.ancho = ancho;
	}
	
	/**
	 * Métodos
	 */
	
	public float calcArea () {
	
		return this.ancho * this.altura;
	}
	
	public float calcPerimetro() {
		return 2 * (this.ancho + this.altura);
	}
	
	public float agrandar(int factor) {
		return this.altura + factor + this.ancho + factor;
		
	}
	public float agrandar2(int ancho, int alto) {
		return this.altura + alto + this.ancho + ancho;
	}
	
	/**
	 * Métodos Getter's y Setter's
	 */
	
	public float getAncho() {return ancho;}
	public void setAncho(float ancho) {this.ancho = ancho;}

	public float getAltura() {return altura;}
	public void setAltura(float altura) {this.altura = altura;}
	
	/**
	 * Método toString
	 */
	
	public String toString() {
		return "\n\tObjeto tipo " + this.getClass().getSimpleName() +
				"\n\tAncho: " + this.ancho +
				"\n\tAlto: " + this.altura;
	}

	
}
