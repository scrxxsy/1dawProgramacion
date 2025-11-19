package libro;

import java.util.Objects;

public class Libro {
	/**
	 * Variables de instancia
	 */
	private String autor;
	private String titulo;
	private boolean estado;
	
	
	/**
	 * Constructor
	 */
	public Libro(String a, String t, boolean e) {
		this.autor = a;
		this.titulo = t;
		this.estado = e;
	}


	/**
	 * Métodos Getter's y Setter's
	 */
	public String getAutor() {return autor;}


	public String getTitulo() {return titulo;}


	public boolean getEstado() {return estado;}


	public void setAutor(String autor) {this.autor = autor;}


	public void setTitulo(String titulo) {this.titulo = titulo;}


	public void setEstado(boolean estado) {this.estado = estado;}


	

	@Override
	/**
	 * Método
	 */
	public boolean equals(Object obj) {
		Libro obLibro = (Libro)obj;
		return this.titulo.equalsIgnoreCase(obLibro.getTitulo()) && this.autor.equalsIgnoreCase(obLibro.getAutor());				
			
	}

	
	@Override
	public String toString() {
		String estadoLibro = this.estado ? "Esta disponible" : "Esta prestado";
		return "\nLibro: " + this.titulo +
				"\nAutor: " + this.autor +
				"\nEstado: " +  estadoLibro;
	}

}

	
