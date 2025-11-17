package prPruebas;

public class EjemploIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coste = 50;

		if (coste < 100) {
			coste = coste + 1;
		}
		else 
			if (coste < 200) { 
				coste = coste + 2;
			}
			else { 
				coste = coste + 3; 
			}
		
		
		if (coste < 100) {
			coste = coste + 1;
		}
		if ((coste >= 100) && (coste < 200)) {  
			coste = coste + 2;
		}
		if (coste >=200) {  
			coste = coste + 3;
		}
	}
		

}
