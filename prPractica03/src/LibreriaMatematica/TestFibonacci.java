package LibreriaMatematica;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("Método que calcula la serie de Fibonacci de forma iterativa: ");
        for (int cont=0;cont<=10;cont++) {
            System.out.println("Fib(" + cont + "): " + LibreriaMatematica.calcFibonacciIterativo(cont));
        }
    }

}

	