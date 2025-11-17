package prExamen01;



public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int DEPOSITO = 0;
		int  minutos=0;
		
		
		
	
		
		for (int cont=DEPOSITO; cont<=1000; cont++) {
			if (DEPOSITO > 800) {
				System.out.println(" Minuto " + minutos + " Se vacía. Nivel = " + DEPOSITO);
				DEPOSITO = DEPOSITO - 10;
				minutos++;
			}
			else if(DEPOSITO < 500) {
				DEPOSITO = DEPOSITO + 130;
				minutos++;
			System.out.println("Minuto " + minutos + " Se rellena rápido. Nivel = " + DEPOSITO );
			
			
			}
			else if (DEPOSITO < 800 ) {
				System.out.println(" Minuto " + minutos + " Relleno lento. Nivel = " + DEPOSITO);
				DEPOSITO = DEPOSITO + 50;
				minutos++;
			
			}
			
			
		}
		System.out.println("El depósito está estabilizado en " + DEPOSITO + " litros en " + minutos  + " minutos");
	}

}


	

	
	


	
