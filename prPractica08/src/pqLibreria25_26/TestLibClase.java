package pqLibreria25_26;

import java.util.Scanner;


public class TestLibClase {

    public static void main(String[] args) {

        byte opcion;
        int[] miArray = new int[10];

        Scanner sc = new Scanner(System.in);

        do {
            opcion = menu(sc);

            switch (opcion) {

            case 1 -> {
                LibreriaClase.cargaElementos(miArray, sc);
            }

            case 2 -> {
                LibreriaClase.cargaElementosAleatorios(miArray, sc);
                System.out.println("Array cargado aleatoriamente.");
            }

            case 3 -> {
                System.out.println(LibreriaClase.toString2(miArray));
            }

            case 4 -> {
                System.out.println("Máximo: " + LibreriaClase.elementoMax(miArray));
            }

            case 5 -> {
                System.out.println("Mínimo: " + LibreriaClase.elementoMin(miArray));
            }

            case 6 -> {
                System.out.println("Suma: " + LibreriaClase.sumaElementosArray(miArray));
            }

            case 7 -> {
                System.out.print("Posición donde insertar: ");
                int pos = sc.nextInt();
                System.out.print("Elemento a insertar: ");
                int elem = sc.nextInt();
                LibreriaClase.insertarPos(miArray, pos, elem);
            }

            case 8 -> {
                System.out.print("Posición a borrar: ");
                int pos = sc.nextInt();
                LibreriaClase.borrarPos(miArray, pos);
            }

            case 9 -> {
                System.out.print("Elemento a borrar: ");
                int elem = sc.nextInt();
                LibreriaClase.borrarElemento(miArray, elem);
            }

            case 10 -> {
                System.out.print("Número a buscar: ");
                int num = sc.nextInt();
                int pos = LibreriaClase.busquedaLineal(miArray, num);
                System.out.println("Resultado búsqueda lineal: " + pos);
            }

            case 11 -> {
                System.out.print("Número a buscar: ");
                int num = sc.nextInt();
                int pos = LibreriaClase.busquedaDic(miArray, num);
                System.out.println("Resultado búsqueda dicotómica: " + pos);
            }

            case 12 -> {
                LibreriaClase.ordenacionBurbuja(miArray);
                System.out.println("Array ordenado por burbuja.");
            }

            case 13 -> {
                LibreriaClase.ordenarInsercion(miArray);
                System.out.println("Array ordenado por inserción.");
            }

            case 14 -> {
                LibreriaClase.ordenarSeleccion(miArray);
                System.out.println("Array ordenado por selección.");
            }

            case 15 -> {
                LibreriaClase.ordenarShell(miArray);
                System.out.println("Array ordenado por Shell.");
            }

            case 16 -> {
                LibreriaClase.desordenarArray(miArray);
                System.out.println("Array desordenado.");
            }

            case 17 -> System.out.println("Saliendo del programa...");

            default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 17);

        sc.close();
    }

    public static byte menu(Scanner sc) {

        byte opcion;
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
        System.out.println("12.- Ordenación por burbuja");
        System.out.println("13.- Ordenación por inserción");
        System.out.println("14.- Ordenación por selección");
        System.out.println("15.- Ordenación por Shell");
        System.out.println("16.- Desordenar array");
        System.out.println("17.- Salir");
        System.out.print("\nIntroduzca la opción: ");
        opcion = sc.nextByte();

        return opcion;
    }
}
