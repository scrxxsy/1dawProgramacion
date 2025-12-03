package ejerRectangulo;

import java.util.Objects;

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
	public void agrandar2(int ancho, int alto) {
		if (ancho < 0 || alto < 0) {
			System.out.println("Debe de ser positivo");
		}
		this.altura+=alto;
		this.ancho+=ancho;
		
		
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

	public void setAncho(int nuevoAncho) {
		if(nuevoAncho<=0) {
			System.out.println("Debe de ser positivo");
		}
		
		this.ancho = nuevoAncho;
	}

	public void setAltura(int nuevaAltura) {
		if(nuevaAltura<=0) {
			System.out.println("Debe de ser positivo");
		}
		
		this.altura = nuevaAltura;
	}

	/**
	 * Método Equals
	 */
	
	@Override
	public boolean equals(Object obj) {
		Rectangulo otrorectangulo = (Rectangulo) obj;
		return altura == otrorectangulo.altura && ancho == otrorectangulo.ancho;
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
