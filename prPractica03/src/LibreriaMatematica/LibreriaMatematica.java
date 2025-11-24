package LibreriaMatematica;

public class LibreriaMatematica {
	/**a) Método al que pasándole un número nos devuelva un valor lógico, el cual indicará si el número es primo 
	o no.**/

	public static boolean esPrimo (int num) {

		int contDivisores=0;

		if (num<=1) {
			return false;

		}
		else {
			for (int cont=2;cont<num;cont++) {
				if (num%cont==0) {
					contDivisores++;
				}
			}

			if (contDivisores>=1) {
				return false;
			}
			else {
				return true;
			}
		}

	}

	/**
	 * b) Método que calcule el factorial de un número, en caso de números negativos debe devolver -1.
	 */

	public static int calcularFactorial (int num) {

		int total = 1;


		if(num < 0) {
			return -1;
		}

		else {
			for (int cont=1; cont <=num; cont++) {
				total = total * cont;

			}
		}
		return total;

	}

	/**
	 * c) Método que calcule el combinatorio de dos números dados, se debe tener en cuenta que para poder 
		calcular el combinatorio de dos números se debe cumplir que a ≥ b, a ≥ 0 y b ≥ 0.
	 */

	public static double calcularCombinatorio (int numA, int numB) {
		int resultado, numAB;

		if (numA>=numB && numA>=0 && numB>=0) {

			numAB = numA - numB;

			resultado = calcularFactorial(numA) /(calcularFactorial(numB) * calcularFactorial(numAB));

			return resultado;
		}
		else {
			return -1;
		}
	}
	public static int numDivisores (int num) {
		int  totalDivisores=0;

		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				totalDivisores+=i;
			}

		}
		return totalDivisores;
	}

	/**
	 * 
	Os aconsejo que hagáis un método privado, que calcule la suma de los divisores de un número, sin contar 
	el propio número, este método os servirá tanto para comprobar si un número es perfecto como para los 
	números amigos.  
	 * @return
	 */

	private static int sumaDivisores(int num) {
		int total=0;

		for (int cont=1; cont<num; cont ++ ) {
			if (num%cont==0) {
				total += cont;
			}
		}
		return total;

	}

	/**
	 * Método para comprobar si un número es perfecto. Un número es perfecto cuando la suma de sus divisores 
	excepto él mismo es igual al propio número. Por ejemplo, son números perfectos 6, 28, 496, …  
	 */

	public static boolean esPerfecto (int num) {

		if (num<=1) {
			return false;
		}

		if(sumaDivisores(num)==num) {
			return true;
		}

		else {
			return false;
		}

	}

	/**
	 *  Método que compruebe si dos números son amigos, debe devolver un valor boolean. Dos números son 
	amigos si la suma de los divisores del primero, excepto él mismo, es igual al segundo número y viceversa. 
	Por ejemplo, son números amigos 6 y 6, 28 y 28, 220 y 284,…
	 */

	public static boolean esAmigo (int num1, int num2) {

		if (num1 < 0 || num2 < 0) {
			return false;
		}

		if(sumaDivisores(num1)==num2 && sumaDivisores(num2)==num1 ) {
			return true;

		}
		else {
			return false;
		}


	}

	/**
	 * Construir un método que calcule el máximo común divisor (MCD) de dos números a y b de tipo entero, 
	sabiendo que: 
	MCD (a, b) = a                si a = b 
	MCD (a, b) = MCD (a-b, b)     si a > b 
	MCD (a, b) = MCD (a, b-a)     si b > a
	 */

	public static int maxComDivRecu (int num1, int num2) {

		if (num1 == num2) {
			return num1;
		}
		if (num1 > num2) {
			return maxComDivRecu(num1 - num2, num2);
		}
		else {
		return maxComDivRecu(num1, num2-num1);
		}
	}

	/**
	 * Método al que se le pasen dos números enteros y nos devuelva el valor verdadero, si ambos números son 
	primos entre sí, y el valor falso en caso contrario. Dos números son primos entre si cuando el único 
	divisor común de los dos es la unidad. Por ejemplo, son primos entre sí, el 5 y 18, 20 y 9, etc… 
	 */

	public static boolean esPrimoEntreSi (int num1, int num2) {

		if (num1 <= 0 || num2 <= 0) {
			return false;
		}

		if(maxComDivRecu(num1, num2) == 1) {
			return true;
		}
		else {
			return false;
		}



	}
	
	/**
	 * Método que calcule la función de Euler. La función de euler es el número de enteros positivos inferiores 
	a dicho número y que son primos con él. Por ejemplo, el euler de 6 es 2, ya que los únicos números 
	inferiores a él y primos con el son el 1 y el 5; euler(4)=2, euler(8)=4, euler(19)=18, euler(20)=8, … 
	 */

	public static int calcEuler (int num) {
		int total = 0;
		if (num<0) {
			return total = -1;
		}
		for (int cont = 1; cont < num; cont ++) {
			if (esPrimoEntreSi(cont, num)) {
				total ++;
			}
		}
		return total;
		
	}
	
	/**
	 * Construir un método que calcule el máximo común divisor (MCD) de dos números a y b de tipo entero, 
	sabiendo que: 
	 */
	
	public static int maxComDiv (int num1, int num2) {
		
		int mcd = 1;
		for (int cont = 1; cont<= Math.min(num1, num2); cont++) {
			if((num1%cont==0)&&(num2%cont==0)){
				mcd = cont;
			}
			
		}
		return mcd;
		
	}
	
	/**
	 * Escribir dos métodos, uno iterativo y otro recursivo para calcular la serie de Fibonacci para un término n, 
	sabiendo que: 
	 */
	
	public static int calcFibonacciIterativo (int num) {
		
		int aux1=1,aux2=1,fibo=2;
		
		for (int cont=0;cont<num;cont++) {
			
			
			aux1=aux2;
			aux2=fibo;
			fibo=aux1+aux2;
			

		}
		return aux1;
	}
	
	/**
	 * Método que calcular la suma de la serie de Fibonacci para un término n de forma recursiva.
	 * Fib(0)= 1 
	   Fib(1)= 1 
	   Fib(N)= Fib(N-1) + Fib(N-2) 
	 */
	
	public static int calcFibonacciRecu (int num) {
		if(num==0) {
			return 1;
		}
		if (num==1) {
			return 1;
		}
		return calcFibonacciRecu(num - 1) + calcFibonacciRecu(num - 2);
		
	}
	
	/**
	 *  Método recursivo que calcula la potencia de un número A elevado a n, se deben tener en cuenta los 
	exponentes negativos.
	 */
	
	public static int calcPontRecu (int num, int exp) {
		if(exp<0) {
			return -1;
		}
		if (exp==0) {
			return 1;
		}
		
		return num * calcPontRecu(num, exp - 1);

	}
	
	/**
	 * Método que calcular la suma de la serie de Fibonacci para un término n de forma recursiva.
	 */
	
	public static int calcSumaFibo (int num) {
		if (num == 0) {
			return 1;
		}
		return calcFibonacciRecu(num) + calcSumaFibo(num -1);
	}
}
