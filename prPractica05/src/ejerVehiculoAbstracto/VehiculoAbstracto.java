package ejerVehiculoAbstracto;

import java.awt.Color;

public abstract class VehiculoAbstracto {
	
	/**
	 * Variables de instancia
	 */
	
	public Color colorVehiculo;
	public byte numRuedas;
	public short cilindrada;
	public short potencia;
	
	
	/**
	 * Constructor
	 */
		
	public VehiculoAbstracto(Color colorVehiculo) {
		this.colorVehiculo = colorVehiculo;
		
	}
	public VehiculoAbstracto (byte numRuedas) {
		this.numRuedas = numRuedas;
		
	}

	public VehiculoAbstracto(short cilindrada) {
		this.cilindrada = cilindrada;
	}
	public VehiculoAbstracto(Color colorVehiculo, byte numRuedas) {
		this.colorVehiculo = colorVehiculo;
		this.numRuedas = numRuedas;

	}

	public VehiculoAbstracto(Color colorVehiculo, byte numRuedas, short cilindrada) {
		this.colorVehiculo = colorVehiculo;
		this.numRuedas = numRuedas;
		this.cilindrada = cilindrada;
	}
	public VehiculoAbstracto(Color colorVehiculo, byte numRuedas, short cilindrada, short potencia) {
		this.colorVehiculo = colorVehiculo;
		this.numRuedas = numRuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}
	
	/**
	 * Métodos Getter's y Setter's 
	 */
	
	public Color getColorVehiculo() {return colorVehiculo;}
	public byte getNumRuedas() {return numRuedas;}
	public short getCilindrada() {return cilindrada;}
	public short getPotencia() {return potencia;}
	
	public void setColorVehiculo(Color colorVehiculo) {this.colorVehiculo = colorVehiculo;}
	public void setNumRuedas(byte numRuedas) {this.numRuedas = numRuedas;}
	public void setCilindrada(short cilindrada) {this.cilindrada = cilindrada;}
	public void setPotencia(short potencia) {this.potencia = potencia;}

	/**
	 * Método
	 * @return
	 */
	public abstract double impuesto();
	/**
	 * Método toString
	 */
	@Override
	
	public String toString() {
		return getClass().getSimpleName().toUpperCase() +
				"\nColor del vehículo: " + this.colorVehiculo +
				"\nNúmero de ruedas del vehículo: " + this.numRuedas +
				"\nCilindrada del vehículo: " + this.cilindrada +
				"\nPotencia del vehículo: " + this.potencia;
	}
	
	


}
