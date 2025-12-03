package ej01;

public class TestRevista {

	public static void main(String[] args) {
		
		Revista r1 = new Revista (3, "Paco" , 2005, 6);
		r1.setAnioPublicacion(2006);
		r1.setIsbn(4);
		r1.setTitulo("Patata");
		r1.setEjemplar(40);
		
		System.out.println(r1);
	}

}
