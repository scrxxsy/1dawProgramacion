package fraccion;

public class Fraccion {
	/**
	 * Variables de instancia
	 */
	
	private int signo;
	private int numerador;
	private int denominador;
	

	/**
	 * Constructor
	 * @throws Exception 
	 */
	
	public Fraccion(int numerador, int denominador) throws Exception  {
		
		if(denominador == 0) {
			throw new Exception("Error, el denominador no puede ser 0");
		}
		
		this.numerador = Math.abs(numerador);
		this.denominador = Math.abs(denominador);
		
		
		
		//Caculo del signo
		if(numerador*denominador < 0) {
			this.signo = -1;
		}
		else {
			this.signo = 1;
		}
	}


	public int getSigno() {
		return signo;
	}


	public int getNumerador() {
		return numerador;
	}


	public int getDenominador() {
		return denominador;
	}


	public void setSigno(int signo) {
		this.signo = signo;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}


	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	/**
	 * Método 
	 */
	
	public Fraccion invierte() throws Exception{
		Fraccion nueva;
		
		nueva = new Fraccion(this.signo*this.denominador, this.numerador);
		
		return nueva;
	}
	public Fraccion invierte2() throws Exception{
		return new Fraccion(this.signo*this.denominador, this.numerador);
	}
	
	/**
	 * Redefinición
	 */
	@Override
	public String toString() {
		if(signo == -1) {
			return "-" + this.numerador + "/" + this.denominador;
			
		}
		else {
			return this.numerador + "/" + this.denominador;
			
		}
	}

}
	