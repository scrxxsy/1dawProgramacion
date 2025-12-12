package ej01;

public class Libro extends Publicacion implements Prestable{
	
	/**
	 * Variables de instancia 
	 */
	
	public boolean prestado;
	
	/**
	 * Constructor 
	 */
	public Libro(int isbn, String titulo, int anioPublicacion) {
		super(isbn, titulo, anioPublicacion);
		
	}
		
	/**
	 * Métodos Getter's y Setter's
	 */
	public boolean isPrestado() {return prestado;}

	public void setPrestado(boolean prestado) {this.prestado = prestado;}
	

	/**
	 * Métodos redefinidos
	 */
	@Override
	public void presta() {
		this.prestado=true;
	}
	


	@Override
	public void devuelve() {
		this.prestado=false;
		
	}

	@Override
	public boolean estaPrestado() {
		return this.isPrestado();
		
	}
	
	/**
	 * Método toString
	 */
	
	@Override
	
	public String toString() {
		return super.toString() +
				"\n\tPrestado: "  + (this.prestado ? "Está prestado" : "Está disponible");
	}
	
	


}
