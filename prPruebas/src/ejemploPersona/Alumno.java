package ejemploPersona;

/**
 * Clase Alumno, contiene la información y los métodos para manejarla
 * sobre un alumno
 */

public class Alumno {

		/**
		 * Variables de clase
		 */
		
	    private static long idProxAlumno = 2900114500L; //Esta variable guardará el id del siguiente alumno	 
	    public static final float SEGUROESCOLAR_MENOR = 1.12F; 
	    public static final float SEGUROESCOLAR_MAYOR = 10F; 
	    
	    /**
	     * Variables de instancia
	     */
	    private long idAlumno; //Identificador del alumno, será único
	    private String nombre;
	    private byte edad;
	    private String curso; // 1ºDAW, 2ºSMR,...
	    
	    /**
	     * Constructor
	     */
	    
	    public  Alumno(String nombreAlumno, byte edadAlumno, String cursoAlumno) {
	    	
	    	//Asignaremos a las variables de instancia el valor de los parámetros recibidos
	    	this.nombre = nombreAlumno;
	    	this.edad = edadAlumno;
	    	this.curso = cursoAlumno;
	    	idProxAlumno ++; //Incrementamos la varibale de clase en 1 , para asginar el número a este alumno
	    	
	    	this.idAlumno = idProxAlumno;
	    	
	    	
	    	
	    }
	    

	    public  Alumno(String nombreAlumno, byte edadAlumno) {
	    	
	    this(nombreAlumno, edadAlumno, "Sin asignar");
	    	
	    	/**this.nombre = nombreAlumno;
	    	this.edad = edadAlumno;
	    	this.curso = "Sin asignar";**/
	    	
	  
	    }
	    
	    
	    /**
	     * Métodos getter's (permiten consultar el valor de las variables de instancia)
	     */
	   
	    
	    public long getIdAlumno() {return idAlumno;}
		public String getNombre() {return nombre;}
		public byte getEdad() {return edad;}
		public String getCurso() {return curso;}
	    
	    /**
	     * Métodos setter's (permiten modificar el valor de las variable de instancia
	     */


		public void setIdAlumno(long idAlumno) {this.idAlumno = idAlumno;}
		public void setNombre(String nombre) {this.nombre = nombre;}
		public void setEdad(byte edad) {this.edad = edad;}
		public void setCurso(String curso) {this.curso = curso;}
	   
	    
	    /**
	     * Redefinición del método toString que ya está definido en la clase Object
	     */
	    
	    @Override 
	    public String toString() {
	    	return "\n\tId: " + this.idAlumno + 
	    			"\n\tNombre: " + this.nombre +
	    			"\n\tEdad: " + this.edad +
	    			"\n\tCurso: " + this.curso;
	    			
	    }

	    /**
	     * Método que comprueba si el alumno es mayor de edad o no
	     * @return
	     */
	    
	    public boolean esMayorDeEdad() {
	    	if(edad>=18) {
	    		return true;
	    	}
	 
	    		return false;
	   
	    }
	    
	    /**
	     * Método que calcula esl coste de la matricula
	     * @return
	     */
	    public float costeMatricula() {
	    	float coste = 300;
	    	
	    	if(esMayorDeEdad()) {
	    		coste += SEGUROESCOLAR_MAYOR;
	    	}
	    	else {
	    		coste += SEGUROESCOLAR_MENOR;
	    	}
	    	
	    	return coste;
	    }




	    
	    
}
