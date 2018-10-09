/*Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.*/
public class ej18 {
	public static void main(String[] args) {
	System.out.println("Escribe un número y te diré su primera cifra (solo si tiene 5 o menos cifras):");
    int numero = Integer.parseInt(System.console().readLine());

    if ((numero >= 0) && (numero < 10)) {
    	System.out.println("Este número solo tiene una cifra: " + numero);
    } else if ((numero >= 10) && (numero < 100)) {
    	System.out.printf("La primera cifra de %d es %d\n", numero, numero/10);
    } else if ((numero >= 100) && (numero < 1000)) {
    	System.out.printf("La primera cifra de %d es %d\n", numero, numero/100);
    } else if ((numero >= 1000) && (numero < 10000)) {
    	System.out.printf("La primera cifra de %d es %d\n", numero, numero/1000);
    } else if ((numero >= 10000) && (numero < 100000)) {
    	System.out.printf("La primera cifra de %d es %d\n", numero, numero/10000);
    }
        
	}
}
