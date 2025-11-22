package ejerEdificios;

public class Guarderia extends Colegio{
	
	/**
	 * Variables de instancia
	 */
	
	public float areaDeJuegos;
	
	/**
	 * Constructor
	 */
	
	public Guarderia(Direccion dirEdificio, int numHabitaciones, int numPlantas, float areaEdificio, int numClases,
			int numOficinas, float areaDeJuegos) {
		super(dirEdificio, numHabitaciones, numPlantas, areaEdificio, numClases, numOficinas);
		this.areaDeJuegos = areaDeJuegos;
	}
	
	
	/**
	 * Métodos Getter's y Setter's
	 */
	
	
	public float getAreaDeJuegos() {return areaDeJuegos;}

	public void setAreaDeJuegos(float areaDeJuegos) {this.areaDeJuegos = areaDeJuegos;}
	
	/**
	 * Redefinicion metodo CalculaIBI
	 */
	
	@Override
	public float calculaIBI() {
		return 0;
	}
	
	
	/**
	 * Método toString
	 */
	
	@Override
	public String toString() {
		return super.toString() + "\n\tÁrea de juegos: " + this.areaDeJuegos;
	}

}
