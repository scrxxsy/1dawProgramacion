package ejerRectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo(3 ,4);
		
		
		System.out.println("El área del rectángulo es de " + r1.calcArea());
		System.out.println("El perímetro del rectángulo es de " + r1.calcPerimetro());
		
		System.out.println(r1.agrandar(3));
		System.out.println(r1.agrandar2(2, 5));
		
		System.out.println(r1);
		
	

	}

}
