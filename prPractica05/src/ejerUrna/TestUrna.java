package ejerUrna;

/**
 * Utilizando un objeto de la clase anteriormente creada, realizar un programa para probarla que haga 
lo siguiente: mientras en la urna quede más de una bola, sacar dos bolas de la misma. Si ambas son 
del mismo color, introducir una bola negra en la urna. Si ambas son de distinto color, introducir una 
bola blanca en la urna. Extraer la última bola que queda y determinar su color. 
 */
public class TestUrna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		char bola1, bola2;

		Urna u1 = new Urna (1,2);

		while (u1.quedaMasDeUnaBola()) {
			System.out.println(u1);

			bola1=u1.sacaBola();
			bola2=u1.sacaBola();

			System.out.println("\nHa salido una bola " + bola1 + " y una bola " + bola2);

			if(bola1==bola2) {
				u1.meteBola('N');

			}

			if(bola1!=bola2) {
				u1.meteBola('B');
			}





		}
		System.out.println(u1);

		if(u1.bolasBlancas==1) {
			System.out.println("\nQueda una bola blanca");
		}
		else {
			System.out.println("\nQueda una bola negra");
		}

	}

}
