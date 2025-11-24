package ejerEdificios;

public class TestColegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direccion dir1 = new Direccion("Avda. Europa", 126, 29210); 

		   
		Colegio co1 = new Colegio (dir1, 5, 2,1f, 20, 10);
		
		System.out.println(co1);
	}

}
