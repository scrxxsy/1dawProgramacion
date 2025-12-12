package ejarrays;

public class ArraysBoletos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boletosVendidos = {10,30,50,30,20,10,70,20,50};
		
		for (int a=0; a<boletosVendidos.length; a++) {
			boolean sw = false;
			for (int b = 0; b<boletosVendidos.length; b++) {
				if(boletosVendidos[a] == boletosVendidos[b] && a != b) {
					sw=true;
				}
				
				
			}
			if(!sw) {
				System.out.println("El boleto con este número esta bien vendido " + boletosVendidos[a]);
			}
				
		}
		

	}

}
