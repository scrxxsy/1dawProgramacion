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
		return this.preciosiniva + (preciosiniva*(porcsiva/100));
	}
	
	public float actualizarPrecio (byte porc) {
		return this.preciosiniva + (preciosiniva * (porc/100));
		
	}
	
	
}
