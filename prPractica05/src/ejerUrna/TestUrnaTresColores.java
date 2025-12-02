package ejerUrna;

public class TestUrnaTresColores {

    public static void main(String[] args) {

        // Crear una urna con números de ejemplo
        UrnaDeTresColores urna = new UrnaDeTresColores(3, 4, 2);

        System.out.println("ESTADO INICIAL:");
        System.out.println(urna);

        System.out.println("\n--- COMIENZA EL PROCESO ---\n");

        // Mientras quede más de una bola
        while (urna.quedaMasDeUnaBola()) {

            char b1 = urna.sacaBola();
            char b2 = urna.sacaBola();

            System.out.println("Saco: " + b1 + " y " + b2);

            if (b1 == 'B' && b2 == 'B') {
                urna.meteBola('R');
                System.out.println("Ambas blancas → meto R");

            } else if (b1 == b2) { // iguales pero no blancas
                urna.meteBola(b1);
                System.out.println("Iguales no blancas → meto " + b1);

            } else { // distintas
                urna.meteBola('B');
                System.out.println("Distintas → meto B");
            }

            System.out.println("Estado actual: " + urna.bolasNegras + "N, "
                    + urna.bolasBlancas + "B, "
                    + urna.bolasRojas + "R");
            System.out.println();
        }

        // Última bola restante
        char ultima = urna.sacaBola();
        System.out.println("--- FIN DEL PROCESO ---");
        System.out.println("La última bola es: " + ultima);
    }
}
