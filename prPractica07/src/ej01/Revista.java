package ej01;

public class Revista extends Publicacion{

	/**
	 * Variables de isntancia
	 */
	
	public int ejemplar;


	/**
	 * Constructor
	 */
	public Revista(int isbn, String titulo, int anioPublicacion, int ejemplar) {
		super(isbn, titulo, anioPublicacion);
		this.ejemplar = ejemplar;
	}

	
	/**
	 * Métodos Getter's y Setter's
	 */

	public int getEjemplar() {
		return ejemplar;
	}


	public void setEjemplar(int ejemplar) {
		this.ejemplar = ejemplar;
	}
	
	/**
	 * Método toString
	 */
	
	@Override
	
	public String toString() {
		return super.toString() + 
				"\n\tEjemplar: " + this.ejemplar;
	}
	
}
