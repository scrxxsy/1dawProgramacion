package LibreriaMatematica;

import java.util.Scanner;

public class TestPontRecu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int base,exponente;

        System.out.print("Introduce la base: ");
        base=sc.nextInt();
        System.out.print("Introduce el exponente: ");
        exponente=sc.nextInt();

        if (LibreriaMatematica.calcPontRecu(base, exponente)==-1) {
            System.out.println("No se puede calcular la potencia de un exponente negativo.");
        }
        else {
            System.out.println("Potencia de " + base + "^" + exponente + ": " + LibreriaMatematica.calcPontRecu(base, exponente));
        }

        sc.close();
		

	}

}
