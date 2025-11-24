package ejerRectangulo;

public class Rectangulo {
	
	/**
	 * Variables de instancia
	 */
	
	public int ancho;
	public int altura;
	
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
	
	public Rectangulo agrandar(int factor) {
		if (factor < 0) {
			return null;
		}
		this.altura*=factor;
		this.ancho*=factor;
		
		return new Rectangulo(this.ancho, this.altura);
		
	}
	public Rectangulo agrandar2(int ancho, int alto) {
		if (ancho < 0 || alto < 0) {
			return null;
		}
		this.altura+=alto;
		this.ancho+=ancho;
		
		return new Rectangulo (this.ancho, this.altura);
	}
	
	/**
	 * Métodos Getter's y Setter's
	 */
	
	public int getAncho() {
		return ancho;
	}

	public int getAltura() {
		return altura;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}


	
	/**
	 * Método toString
	 */
	
	public String toString() {
		return "\n\tObjeto tipo " + this.getClass().getSimpleName() +
				"\n\tAncho: " + this.ancho +
				"\n\tAlto: " + this.altura;
	}


	
}
