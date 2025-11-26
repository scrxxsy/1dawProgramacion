package ejerUrna;

public class Urna {

	/**
	 * Variables de instancia
	 */
	
	public int bolasNegras;
	public int bolasBlancas;

	/**
	 * Constructor
	 */
	public Urna(int bolasNegras, int bolasBlancas) {
		
		this.bolasNegras = bolasNegras;
		this.bolasBlancas = bolasBlancas;
	}
	
	/**
	 * Métodos
	 */
	
	public char sacaBola() {
		int random = (int)Math.random()*2;
		
		if (random==0) {
			this.bolasNegras--;
			return 'N';
		}
		
		else {
			this.bolasBlancas--;
			return 'B';
			
		}
	}
	
	
	public void meteBola(char color) {
		if(color=='N') {
			this.bolasNegras++;
		}
		else if (color=='B') {
			this.bolasBlancas++;
		}
	}
	
	public boolean quedanBolas() {
		if (this.bolasBlancas + this.bolasNegras > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean quedaMasDeUnaBola() {
		if (this.bolasBlancas + this.bolasNegras > 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	/**
	 * Métodos Getter's y Setter's
	 */
	private int totalBolas() {
		return this.bolasBlancas + this.bolasNegras;
	}

	public int getBolasNegras() {
		return bolasNegras;
	}

	public int getBolasBlancas() {
		return bolasBlancas;
	}

	public void setBolasNegras(int bolasNegras) {
		this.bolasNegras = bolasNegras;
	}

	public void setBolasBlancas(int bolasBlancas) {
		this.bolasBlancas = bolasBlancas;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName().toUpperCase() +
				"\n\tNúmero de bolas negras: " + this.bolasNegras +
				"\n\tNúmero de bolas blancas: " + this.bolasBlancas +
				"\n\tTotal de bolas: " + totalBolas();
	}
	
	
}

