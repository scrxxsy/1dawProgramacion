package ejerEdificios;

public class Colegio extends Edificio {
	
	/**
	 * Variables de instancia
	 */
	
	private int numClases;
	private int numOficinas;
	
	
	/**
	 * Constructor
	 */
	public Colegio(Direccion dirEdificio, int numHabitaciones, int numPlantas, float areaEdificio, int numClases,
			int numOficinas) {
		super(dirEdificio, numHabitaciones, numPlantas, areaEdificio);
		this.numClases = numClases;
		this.numOficinas = numOficinas;
	}
	
	/**
	 * Métodos Getter's y Setter's
	 */
	

	public int getNumClases() {return numClases;}
	public void setNumClases(int numClases) {this.numClases = numClases;}

	public int getNumOficinas() {return numOficinas;}
	public void setNumOficinas(int numOficinas) {this.numOficinas = numOficinas;}
	
	
	/**
	 * Método  calculaIBI() redefinido
	 */

	@Override
	public float calculaIBI() {
		return super.calculaIBI() - 500;
		
		
	}
	
	/**
	 * Método toString
	 */
	
	@Override
	
	public String toString() {
		return super.toString() + "\n\tNúmero de clases: " + this.numClases +
				"\n\tNúmero de oficinas: " + this.numOficinas;
	}
}
