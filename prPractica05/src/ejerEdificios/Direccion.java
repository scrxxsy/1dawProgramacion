package ejerEdificios;

public class Direccion {
	
	/**
	 * Variables de isntancia
	 */
	private String nomCalle; 	//Nombre de la calle
	private int numDireccion;	//Número del edificio
	private int codPostal;		//Código postal
	
	
	/**
	 * Constructor
	 */
	public Direccion(String nomCalle, int numDireccion, int codPostal) {
		super();
		this.nomCalle = nomCalle;
		this.numDireccion = numDireccion;
		this.codPostal = codPostal;
	}


	
	
	/**
	 * Métodos Getter's y Setter's
	 */
	
	public String getNomCalle() {return nomCalle;}
	public int getNumDireccion() {return numDireccion;}
	public int getCodPostal() {return codPostal;}


	public void setNomCalle(String nomCalle) {this.nomCalle = nomCalle;}
	public void setNumDireccion(int numDireccion) {this.numDireccion = numDireccion;}
	public void setCodPostal(int codPostal) {this.codPostal = codPostal;}


	
	/**
	 * Redefición de toString
	 */
	@Override
	public String toString() {
		return this.nomCalle + "," + this.numDireccion + " (" + this.codPostal + ")";
	}
	
	
	

}
