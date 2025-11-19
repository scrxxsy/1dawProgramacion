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
		return this.colorSemaforo;
	}
	
	/**
	 * Métodos
	 */
	
	public  boolean puedoPasar() {
		if(this.colorSemaforo.equalsIgnoreCase("Rojo")) {
			return false;
		}
		else {
			return true;
		}
		
	}

	 /**public Semaforo(String colorSemaforo) {
		this.colorSemaforo = colorSemaforo;
	  }**/

	  /**
	   * Redefinición del método toString
	   */
	  @Override 
	    public String toString() {
		  
		  	String cadena;
		  	switch(this.colorSemaforo) {
		  		case "Rojo"-> cadena = "No puede pasar";
		  		case "Amarillo" -> cadena = "Pase con precaución";
		  		case "Verde" -> cadena = "Puede pasar";
		  		default -> cadena = "Semáforo averiado";
		  	}
		  
	    	return "El semáforo se encuentra en color " + this.colorSemaforo + " (" + cadena + ")";
	    			
	    }

 

	

	
}
