package coche;

public class Coche {
	
	/**
	 * Variables de isntancia
	 */
	private String modelo;
	private String fabricante;
	private float preciosiniva;
	public byte porcsiva;
	

	
	/**
	 * Constructores
	 */
	public Coche() {
		
	}



	public Coche(String modelo, String fabricante, float preciosiniva, byte porcsiva) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.preciosiniva = preciosiniva;
		this.porcsiva = porcsiva;
	}



	public Coche(String modelo, String fabricante, float preciosiniva) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.preciosiniva = preciosiniva;
	}
	
	/**
	 * Métodos
	 */
	
	public void consulta() {
		System.out.println("Modelo: " + this.modelo +
				"Precio: " + precioReal() + " €");
		
	}
	
	private float precioReal() {
		return this.preciosiniva + (this.preciosiniva*(porcsiva/100f));
	}
	
	public float subirPrecioCoche (byte porc) {
		return this.preciosiniva + (this.preciosiniva * (porc/100f));
		
	}
	public float bajarPrecioCoche (byte porc) {
		return this.preciosiniva + (this.preciosiniva * (porc/100f));
	
	}



	/**
	 * Métodos Getter's y Setter's
	 */
	

	public String getModelo() {return modelo;}
	public void setModelo(String modelo) {this.modelo = modelo;}
	
	public String getFabricante() {return fabricante;}
	public void setFabricante(String fabricante) {this.fabricante = fabricante;}
	
	public float getPreciosiniva() {return preciosiniva;}
	public void setPreciosiniva(float preciosiniva) {this.preciosiniva = preciosiniva;}
	
	public byte getPorcsiva() {return porcsiva;}
	public void setPorcsiva(byte porcsiva) {this.porcsiva = porcsiva;}
	
	/**
	 * Método toString
	 */
	
	
	@Override
	public String toString() {
	    return "\nModelo de coche: " + this.modelo +
	           "\nFabricante: " + this.fabricante +
	           "\nPrecio Total: " + precioReal();
	}

}
