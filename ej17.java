/*Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.*/
public class ej17 {
	public static void main(String[] args) {
	System.out.println("Escribe un número y te diré su última cifra:");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.printf("La última cifra de %d es %d\n", numero, numero%10);
	}
}