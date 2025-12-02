package ejerVehiculoAbstracto;

import java.awt.Color;

public class TestMotocicleta {

    public static void main(String[] args) {

        // 1️⃣ Motocicleta con solo número de ocupantes
        Motocicleta moto1 = new Motocicleta((byte)2);
        System.out.println("=== MOTOCICLETA 1 ===");
        System.out.println(moto1);
        System.out.println("Impuesto: " + moto1.impuesto() + "\n");

      
        
    }
}
