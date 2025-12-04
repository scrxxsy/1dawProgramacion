package ejerVehiculoAbstracto;

import java.awt.Color;

public class Motocicleta extends VehiculoAbstracto{
	
	/**
	 * Variables de isntancia
	 */
	public byte numDeOcupantes;

	
	
	/**
	 * Constructores
	 */
	public Motocicleta() {
		super(Color.black, (byte)2, (short)500, (short)50);
		
	}
	public Motocicleta(byte numDeOcupantes) {
		super(Color.black, (byte)2, (short)500, (short)50);
		this.numDeOcupantes = numDeOcupantes;
	}
	public Motocicleta (Color colorVehiculo) {
		super (colorVehiculo,(byte)2, (short)500, (short)50);
	}
	public Motocicleta (Color colorVehiculo,  short cilindrada, short potencia) {
		super (colorVehiculo, (byte)2, cilindrada, potencia);
	}

	
	/**
	 * Métodos Getter's y Setter's
	 */
	public byte getNumDeOcupantes() {
		return numDeOcupantes;
	}
	public void setNumDeOcupantes(byte numDeOcupantes) {
		this.numDeOcupantes = numDeOcupantes;
	}
	
	@Override
	public double impuesto() {
		return  getCilindrada()/30f + getPotencia()*30f; 
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nImpuesto motocicleta: " + this.impuesto();
	}

}
