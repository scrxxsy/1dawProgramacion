package ejerUrna;

public class UrnaDeTresColores extends Urna{

	/**
	 * Variables de Instancia 
	 */
	public int bolasRojas;

	/**
	 * Constructor
	 */

	public UrnaDeTresColores(int bolasNegras, int bolasBlancas, int bolasRojas) {
		super(bolasNegras, bolasBlancas);
		this.bolasRojas = bolasRojas;
	}
	/**
	 * Métodos 
	 */
	@Override 



	public char sacaBola() {

		int total = this.bolasBlancas + this.bolasNegras + this.bolasRojas;
		int random = (int)Math.random()*total;

		if(random<this.bolasNegras) {
			this.bolasNegras--;
			if(this.bolasNegras<=0) {
				this.bolasNegras=0;
			}
			return 'N';
		}
		else if (random<this.bolasBlancas) {
			this.bolasBlancas--;
			if(this.bolasBlancas<=0) {
				this.bolasBlancas=0;

			}
			return 'B';
		}
		else {
			this.bolasRojas--;
			if(this.bolasRojas<0) {
				this.bolasRojas=0;
			}
			return 'R';
		}
		


	}
	
	@Override
	public void meteBola(char color) {
		if(color=='R') {
			this.bolasRojas++;
		}
		else {
			super.meteBola(color);
		}
	}
	
	@Override
	public int totalBolas() {
		return super.totalBolas() + this.bolasRojas;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName().toUpperCase() +
				"\n\tNúmero de bolas negras: " + this.bolasNegras +
				"\n\tNúmero de bolas blancas: " + this.bolasBlancas +
				"\n\tNúmero de bolas rojas: " + this.bolasRojas +
				"\n\tTotal de bolas: " + super.totalBolas() ;
	}
}

