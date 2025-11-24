package ejerEdificios;

public class TestParqueBomberos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direccion dir2 = new Direccion("Calle alameda", 2, 29200);
		Direccion dir3 = new Direccion("Calle Cachopo", 5, 29230);
		Direccion dir1 = new Direccion("Calle Raideo", 16, 29210);
		
		Edificio parquebomb = new Edificio (dir2, 10, 2, 1000);
		Casa c1 = new Casa(dir3, 6, 2, 150, 4, 2);
		Colegio co1 = new Colegio (dir1, 25, 3, 2000, 18, 3);
		Guarderia gua1 = new Guarderia (dir1, 25, 3, 2000, 17 , 3 , 400);
		
		System.out.println(parquebomb);
		System.out.println(c1);
		System.out.println(co1);
		System.out.println(gua1);
		
		

	}

}
