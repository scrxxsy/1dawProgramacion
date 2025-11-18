package semaforo;

public class Semaforo {
	
	/**
	 * Variables de instancia
	 */
	
	private String colorSemaforo = "Rojo";
	
	/**
	 * Métodos Getter's y Setter's
	 */
	public void setColor(String nuevoColor) {
		this.colorSemaforo = nuevoColor;
	}


	public String getColor() {
		return colorSemaforo;
	}
	
	/**
	 * Métodos
	 */
	
	public  boolean puedoPasar() {
		if(this.colorSemaforo.equals("Rojo")) {
			return false;
		}
		else {
			return true;
		}
		
	}

	  public Semaforo(String colorSemaforo) {
		this.colorSemaforo = colorSemaforo;
	  }

	
	  @Override 
	    public String toString() {
	    	return "El semáforo se encuentra en color " + this.colorSemaforo;
	    			
	    }



	

	
}
