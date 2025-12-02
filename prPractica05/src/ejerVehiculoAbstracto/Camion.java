package ejerVehiculoAbstracto;

import java.awt.Color;

public class Camion extends VehiculoAbstracto{

	/**
	 * Variable de instancia
	 */
	
	public int numEjes;
	
	
	
	/**
	 * Constructor
	 * @param colorVehiculo
	 */
	
	public Camion(Color colorVehiculo, int numEjes) {
		super(colorVehiculo);
		this.numEjes = numEjes;
	}
	public Camion (byte numRuedas) {
		super(Color.black, numRuedas, (short)1500, (short)100);
	}
	public Camion (Color colorVehiculo, byte numRuedas) {
		super(colorVehiculo, numRuedas, (short)1500, (short)100);
	}
	
	public Camion (Color colorVehiculo, byte numRuedas, short cilindrada) {
		super(colorVehiculo, numRuedas, cilindrada, (short)100);
	}
	public Camion (Color colorVehiculo, byte numRuedas, short cilindrada, short potencia) {
		super(colorVehiculo, numRuedas, cilindrada, potencia);
	}

	/**
	 * Métodos Getter's y Setter's
	 */
	
	
	public int getNumEjes() {return numEjes;}
	public void setNumEjes(int numEjes) {this.numEjes = numEjes;}
	
	/**
	 * Método toString
	 */
	
	@Override
	
	public String toString() {
		return super.toString() +
		"\nNúmero de ejes del vehículo: " + this.numEjes+
		"\nImpuesto del camion: " + impuesto();
		}
	
	
	/**
	 * Método
	 */
	@Override 
	
	public  double impuesto() {
		return (this.cilindrada/30 + this.potencia*20 + this.numRuedas*20 + this.numEjes*50);
	}

}
	