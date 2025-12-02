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
		
		int total = this.bolasBlancas + this.bolasNegras;
		int random = (int)Math.random()*total;

		if(random<this.bolasNegras) {
			this.bolasNegras--;
			if(this.bolasNegras<=0) {
				this.bolasNegras=0;
			}
			return 'N';
		}
		else {
			this.bolasBlancas--;
			if(this.bolasBlancas<=0) {
				this.bolasBlancas=0;

			}
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
	public int totalBolas() {
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

