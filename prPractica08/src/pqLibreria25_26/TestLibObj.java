package pqLibreria25_26;

import java.util.Scanner;

public class TestLibObj {

    public static void main(String[] args) {

        byte opcion;
        LibreriaObjeto ob = new LibreriaObjeto(8);
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            System.out.print("\nIntroduzca la opción: ");
            opcion = sc.nextByte();

            switch (opcion) {

            case 1 -> ob.cargaElementos(sc);

            case 2 -> ob.cargaElementosAleatorios();

            case 3 -> System.out.println(ob.toString());

            case 4 -> System.out.println("Máximo: " + ob.elementoMax());

            case 5 -> System.out.println("Mínimo: " + ob.elementoMin());

            case 6 -> System.out.println("Suma: " + ob.sumaElementosArray());

            case 7 -> {
                System.out.print("Posición a insertar: ");
                int pos = sc.nextInt();
                System.out.print("Elemento: ");
                int elem = sc.nextInt();
                ob.insertarPos(pos, elem);
            }

            case 8 -> {
                System.out.print("Posición a borrar: ");
                int pos = sc.nextInt();
                ob.borrarPos(pos);
            }

            case 9 -> {
                System.out.print("Elemento a borrar: ");
                int elem = sc.nextInt();
                ob.borrarElemento(elem);
            }

            case 10 -> {
                System.out.print("Número a buscar: ");
                int num = sc.nextInt();
                int pos = LibreriaObjeto.busquedaLineal(ob.getArray(), num);
                System.out.println("Resultado: " + pos);
            }

            case 11 -> {
                System.out.print("Número a buscar: ");
                int num = sc.nextInt();
                int pos = LibreriaObjeto.busquedaDic(ob.getArray(), num);
                System.out.println("Resultado: " + pos);
            }

            case 12 -> {
                ob.ordenacionArray(ob.getArray());
                System.out.println("Ordenado por burbuja.");
            }

            case 13 -> {
                LibreriaObjeto.ordenarInsercion(ob.getArray());
                System.out.println("Ordenado por inserción.");
            }

            case 14 -> {
                LibreriaObjeto.ordenarSeleccion(ob.getArray());
                System.out.println("Ordenado por selección.");
            }

            case 15 -> {
                LibreriaObjeto.ordenarShell(ob.getArray());
                System.out.println("Ordenado por Shell.");
            }

            case 16 -> {
                ob.desordenarArray();
                System.out.println("Array desordenado.");
            }

            case 17 -> System.out.println("Saliendo...");

            default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 17);

        sc.close();
    }

    public static void menu() {
        System.out.println("\n --- MENU DE OPERACIONES ---");
        System.out.println("1.- Carga de datos desde teclado");
        System.out.println("2.- Carga de datos aleatoria");
        System.out.println("3.- Mostrar array");
        System.out.println("4.- Valor máximo del array");
        System.out.println("5.- Valor mínimo del array");
        System.out.println("6.- Suma de los elementos del array");
        System.out.println("7.- Insertar por posición");
        System.out.println("8.- Borrar por posición");
        System.out.println("9.- Borrar buscando el número");
        System.out.println("10.- Búsqueda lineal");
        System.out.println("11.- Búsqueda binaria o dicotómica");
        System.out.println("12.- Ordenación por el método de la burbuja");
        System.out.println("13.- Ordenación por el método de inserción");
        System.out.println("14.- Ordenación por el método de selección");
        System.out.println("15.- Ordenación por el método de Shell");
        System.out.println("16.- Desordenar array");
        System.out.println("17.- Salir");
    }
}
