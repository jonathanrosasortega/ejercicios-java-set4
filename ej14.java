/*Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.*/
public class ej14 {
	public static void main(String[] args) {
	
	System.out.println("Introduce un número y te diré si es par, divisible entre 5, o ambos:");
    int numero = Integer.parseInt(System.console().readLine());

    if ((numero % 2 == 0) && (numero % 5 == 0)) {
    	System.out.printf("El número %d es par y también divisible entre 5.\n", numero);
    } else if ((numero % 2 == 0) && (numero % 5 != 0)) {
    	System.out.printf("El número %d es par pero no es divisible entre 5.\n", numero);
    } else if ((numero % 2 != 0) && (numero % 5 == 0)) {
    	System.out.printf("El número %d es impar y también divisible entre 5.\n", numero);
    } else {
    	System.out.printf("El número %d es impar y no divisible entre 5.\n", numero);
    }

    
	}
}
