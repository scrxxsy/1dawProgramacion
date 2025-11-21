package ejerEdificios;

/**
 * Clase que testea el funcionamiento de las clases Direccion, Edificio, Casa, Colegio y Guardería
 */

public class TestEdificio {

    public static void main(String[] args) {

        Direccion dir1 = new Direccion("Avda. Europa", 126, 29210);
        Direccion dir2 = new Direccion("Calle alameda", 2, 29200);
        
        System.out.println(dir1);
        
        System.out.println(dir2);
        
        Edificio edi1 = new Edificio (dir1, 10, 3 , 1000);
        Edificio edi2 = new Edificio ("Calle Lucena", 5, 29200, 3, 1,100);
        
        System.out.println(edi1.toString());
        System.out.println(edi2.toString());
    }

}