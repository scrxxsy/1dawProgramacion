package ejerEdificios;

public class Casa extends Edificio{
	
	/**
	 * Variables de instancia
	 */
	
	private int numDormitorios;
	private int numBanios;
	
	
	/**
	 * Constructor
	 */
	public Casa(Direccion dirEdificio, int numHabitaciones, int numPlantas, float areaEdificio, int numDormitorios,
			int numBanios) {
		super(dirEdificio, numHabitaciones, numPlantas, areaEdificio);
		this.numDormitorios = numDormitorios;
		this.numBanios = numBanios;
	}

	/**
	 * Métodos Getter's y Setter's
	 */
	
	public int getNumDormitorios() {return numDormitorios;}
	public void setNumDormitorios(int numDormitorios) {this.numDormitorios = numDormitorios;}


	public int getNumBanios() {return numBanios;}
	public void setNumBanios(int numBanios) {this.numBanios = numBanios;}
	
	
	/**
	 * Método CalculoIBI() redefinido
	 */
	
	@Override
	public float calculaIBI() {
		return super.calculaIBI() + numBanios * 10;
		
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n\tNúmero de dormitorios: " + this.numDormitorios +
				"\n\tNúmero de baños: " + this.numBanios;
	}
	

}


