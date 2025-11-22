package ejerEdificios;

public class TestGuarderia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Direccion dir1 = new Direccion("Avda. Europa", 126, 29210); 

	
		
		Guarderia gua1 = new Guarderia (dir1, 5, 2, 300f, 20, 10, 200);
		
		System.out.println(gua1);
	}

}
