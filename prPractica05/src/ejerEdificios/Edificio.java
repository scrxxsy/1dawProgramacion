package ejerEdificios;


public class Edificio {
	/**
	 * Variables de instancia
	 */
	
	private Direccion dirEdificio;
	private int numHabitaciones;
	private int numPlantas;
	private float areaEdificio;
	
	/**
	 * Constructor que recibe como parámetro todos los datos de un edificio
	 * @param dirEdificio
	 * @param numHabitaciones
	 * @param numPlantas
	 * @param areaEdificio
	 */
	
	public Edificio(Direccion dirEdificio, int numHabitaciones, int numPlantas, float areaEdificio) {
		super();
		this.dirEdificio = dirEdificio;
		this.numHabitaciones = numHabitaciones;
		this.numPlantas = numPlantas;
		this.areaEdificio = areaEdificio;
	}
	
	/**
	 * Constructor que recibe todos los datos del edifico, pero en el caso de la dirección, nos llegan los datos del objeto, el cual creamos en el propio 
	 * constructor
	 * @param nomCalle
	 * @param numDireccion
	 * @param codPostal
	 * @param numHabitaciones
	 * @param numPlantas
	 * @param areaEdificio
	 */
	public Edificio(String nomCalle, int numDireccion, int codPostal, 
					int numHabitaciones, int numPlantas, float areaEdificio) {
		
		this( new Direccion(nomCalle, numDireccion, codPostal), numHabitaciones, numPlantas, areaEdificio);
		
//		this.dirEdificio = new Direccion(nomCalle, numDireccion, codPostal);
//		this.numHabitaciones = numHabitaciones;
//		this.numPlantas = numPlantas;
//		this.areaEdificio = areaEdificio;
	}

	/**
	 * Métodos Getter's y Setter's
	 * @return
	 */
	public Direccion getDirEdificio() {return dirEdificio;}
	public int getNumHabitaciones() {return numHabitaciones;}
	public int getNumPlantas() {return numPlantas;}
	public float getAreaEdificio() {return areaEdificio;}

	public void setDirEdificio(Direccion dirEdificio) {this.dirEdificio = dirEdificio;}
	public void setNumHabitaciones(int numHabitaciones) {this.numHabitaciones = numHabitaciones;}
	public void setNumPlantas(int numPlantas) {this.numPlantas = numPlantas;}
	public void setAreaEdificio(float areaEdificio) {this.areaEdificio = areaEdificio;}

	/**
	 * Método que calcula el IBI de un edificio , el cual se calcula sumando el 
	 * área del edificio multipicando 1.2 y el número de plantas multiplicado por 100
	 */
	
	public float calculaIBI() {
		return this.areaEdificio*1.2f + this.numPlantas*100;
	}

	
	/**
	 Redefinición de toString(redefinimos toString de la clase Object)
	 */
	
	@Override
	public String toString() {
		return  this.getClass().getSimpleName() + //Obtener el nombre de la case
				"\n\tDireccion: " + this.dirEdificio.toString() +
				"\n\tImpuesto de IBI" + this.calculaIBI() + " €" +
				"\n\tNúmero de habitaciones: " + this.numHabitaciones +
				"\n\tNúmero de plantas: " + this.numPlantas +
				"\n\tÁrea edificio: " + this.areaEdificio;
	}
	
	

}
