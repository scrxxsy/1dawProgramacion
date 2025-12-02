package ejerVehiculoAbstracto;

import java.awt.Color;

public class TestCamion {

    public static void main(String[] args) {

        // 1️⃣ Constructor: Color + numEjes
        Camion camion1 = new Camion(Color.RED, 3);
        camion1.setNumRuedas((byte)6);       // Añadimos ruedas porque el constructor no las define
        camion1.setCilindrada((short)5000);  // Cilindrada por defecto
        camion1.setPotencia((short)400);     // Potencia por defecto

        System.out.println("=== CAMION 1 ===");
        System.out.println(camion1);
      

        // 2️⃣ Constructor: solo numRuedas
        Camion camion2 = new Camion((byte)8);
        camion2.setNumEjes(4);

        System.out.println("=== CAMION 2 ===");
        System.out.println(camion2);
        

        // 3️⃣ Constructor: Color + numRuedas
        Camion camion3 = new Camion(Color.BLUE, (byte)10);
        camion3.setNumEjes(5);
        camion3.setCilindrada((short)8000);
        camion3.setPotencia((short)600);

        System.out.println("=== CAMION 3 ===");
        System.out.println(camion3);
      

        // 4️⃣ Constructor: Color + numRuedas + cilindrada
        Camion camion4 = new Camion(Color.GREEN, (byte)12, (short)9000);
        camion4.setNumEjes(6);
        camion4.setPotencia((short)700);

        System.out.println("=== CAMION 4 ===");
        System.out.println(camion4);
        

        // 5️⃣ Constructor completo: Color + numRuedas + cilindrada + potencia
        Camion camion5 = new Camion(Color.YELLOW, (byte)14, (short)10000, (short)800);
        camion5.setNumEjes(7);

        System.out.println("=== CAMION 5 ===");
        System.out.println(camion5);
        
    }
}
