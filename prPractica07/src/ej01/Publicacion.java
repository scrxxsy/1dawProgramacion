package ej01;

public class Publicacion {
	
	/**
	 * Variables de instancia
	 */
	
	public int isbn;
	public String titulo;
	public int anioPublicacion;
	
	
	/**
	 * Constructor
	 */
	public Publicacion(int isbn, String titulo, int anioPublicacion) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}


	
	/**
	 * Métodos Getter's y Seterr's
	 */
	
	public int getIsbn() {return isbn;}
	public String getTitulo() {return titulo;}
	public int getAnioPublicacion() {return anioPublicacion;}

	public void setIsbn(int isbn) {this.isbn = isbn;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setAnioPublicacion(int anioPublicacion) {this.anioPublicacion = anioPublicacion;}
	
	/**
	 * Método toString
	 */
	
	@Override
	
	public String toString() {
		return getClass().getSimpleName().toUpperCase() +
				"\n\tISBN: " + this.isbn +
				"\n\tTitulo: " + this.titulo + 
				"\n\tAño de publicacion: " + this.anioPublicacion;
		
	}
	

}
