package ejerEdificios;

public class TestCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direccion dir1 = new Direccion("Avda. Europa", 126, 29210); 
        
        Casa c1 = new Casa (dir1, 5, 2, 150.5f, 3, 2);
        
        System.out.println(c1);
        

	}

}
